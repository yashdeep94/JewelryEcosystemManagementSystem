package dao;

import model.EcoSystem;
import model.employee.EmployeeProfile;
import model.enterprise.*;
import model.network.Network;
import model.organization.Organization;
import model.person.Person;
import model.person.PersonDirectory;
import model.product.Gold;
import model.product.Product;
import model.role.Role;
import model.role.*;
import model.userAccount.UserAccount;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EcosystemDAO {

    public static Network fetchNetwork(Connection conn) throws SQLException {
        String sql = "SELECT * FROM Network LIMIT 1";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                Network network = new Network();
                network.setName(rs.getString("name"));
                return network;
            }
        }
        return null;
    }

    public static void fetchEnterprises(Connection conn, Network network) throws SQLException {
        String sql = "SELECT * FROM Enterprise";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String name = rs.getString("name");
                String type = rs.getString("type");
                Enterprise enterprise = createEnterprise(type, name);
                if (enterprise != null) {
                    network.getEnterpriseDirectory().getEnterpriseList().add(enterprise);
                    createOrganizationsForEnterprise(enterprise);
                }
            }
        }
    }

    private static void createOrganizationsForEnterprise(Enterprise enterprise) {
        if (enterprise instanceof JewelleryShopEnterprise) {
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Billing);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Gold);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Silver);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Security);
        } else if (enterprise instanceof HallmarkingEnterprise) {
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.BillingHallmarking);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Refinery);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.StampId);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Testing);
        } else if (enterprise instanceof ManufacturingEnterprise) {
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.BillingManufacturing);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.HandCraft);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Machinery);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Polishing);
        } else if (enterprise instanceof BankingEnterprise) {
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Account);
            enterprise.getOrganizationDirectory().createOrganization(Organization.Type.GoldSelling);
        }
    }

    public static void fetchPersons(Connection conn, Network network) throws SQLException {
        String sql = "SELECT * FROM Person";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Person person = new Person();
                person.setFirstName(rs.getString("first_name"));
                person.setMiddleName(rs.getString("middle_name"));
                person.setLastName(rs.getString("last_name"));
                person.setGender(rs.getString("gender"));
                person.setAge(rs.getInt("age"));
                person.setEmailId(rs.getString("email"));
                person.setPhoneNumber(rs.getString("phone"));
                network.getPersonDirectory().getPersons().add(person);
            }
        }
    }

    public static void fetchEmployeesAndUserAccounts(Connection conn, EcoSystem system, Network network) throws SQLException {
        String sql = "SELECT * FROM Employee e JOIN UserAccount ua ON e.id = ua.employee_id";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("enterprise_id") != 0) {
                    Person person = findPersonById(network.getPersonDirectory(), rs.getInt("person_id"));
                    Enterprise enterprise = findEnterpriseById(network, rs.getInt("enterprise_id"));
                    String roleName = rs.getString("role");
                    
                    if (roleName.contains("Admin")) {
                        EmployeeProfile employee = enterprise.getEmployeeDirectory().createEmployee(person);
                        UserAccount ua = enterprise.getUserAccountDirectory().createUserAccount(
                            rs.getString("username"),
                            rs.getString("password"),
                            employee,
                            createRole(roleName)
                        );
                    } else {
                        Organization organization = findOrganizationByRole(enterprise, roleName);
                        if (organization != null) {
                            EmployeeProfile employee = organization.getEmployeeDirectory().createEmployee(person);
                            UserAccount ua = organization.getUserAccountDirectory().createUserAccount(
                                rs.getString("username"),
                                rs.getString("password"),
                                employee,
                                createRole(roleName)
                            );
                        }
                    }
                }
            }
        }
    }

    public static void fetchProducts(Connection conn, Network network) throws SQLException {
        String sql = "SELECT * FROM Product";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                if (rs.getInt("enterprise_id") != 0) {
                    Enterprise enterprise = findEnterpriseById(network, rs.getInt("enterprise_id"));
                    if (enterprise instanceof JewelleryShopEnterprise) {
                        JewelleryShopEnterprise jse = (JewelleryShopEnterprise) enterprise;
//                        populateCustomers(jse, network);
                        jse.getProducts().CreateNewProduct(
                            Product.ProductType.valueOf(rs.getString("type")),
                            rs.getString("name"),
                            rs.getDouble("weight"),
                            rs.getDouble("price"),
                            rs.getInt("purity")
                        );
                    }
                }
            }
        }
    }

    public static void populateCustomers(Network network) {
//        JewelleryShopEnterprise js;
        for (Enterprise js : network.getEnterpriseDirectory().getEnterpriseList()){
            if(js instanceof JewelleryShopEnterprise){
                for (Person p : network.getPersonDirectory().getPersons()) {
                    js.getCustomerDirectory().CreateNewCustomer(p);
                }
            }
        }
        
    }

    private static Enterprise createEnterprise(String type, String name) {
        switch (type) {
            case "JewelleryShop":
                return new JewelleryShopEnterprise(name);
            case "Hallmarking":
                return new HallmarkingEnterprise(name);
            case "Manufacturing":
                return new ManufacturingEnterprise(name);
            case "Banking":
                return new BankingEnterprise(name);
            default:
                return null;
        }
    }

    private static Person findPersonById(PersonDirectory personDirectory, int id) {
        for (Person person : personDirectory.getPersons()) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    private static Enterprise findEnterpriseById(Network network, int id) {
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getId() == id) {
                return enterprise;
            }
        }
        return null;
    }

    private static Organization findOrganizationByRole(Enterprise enterprise, String roleName) {
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org.getSupportedRole().stream().anyMatch(role -> role.getClass().getSimpleName().equals(roleName))) {
                return org;
            }
        }
        return null;
    }

    private static Role createRole(String roleName) {
        switch (roleName) {
            case "SystemAdminRole":
                return new SystemAdminRole();
            case "AdminJewelleryShopRole":
                return new AdminJewelleryShopRole();
            case "AdminHallmarkingRole":
                return new AdminHallmarkingRole();
            case "AdminManufacturingRole":
                return new AdminManufacturingRole();
            case "AdminBankingRole":
                return new AdminBankingRole();
            case "GoldRole":
                return new GoldRole();
            case "SilverRole":
                return new SilverRole();
            case "BillingRole":
                return new BillingRole();
            case "SecurityRole":
                return new SecurityRole();
            case "RefineryRole":
                return new RefineryRole();
            case "TestingRole":
                return new TestingRole();
            case "StampIdRole":
                return new StampIdRole();
            case "BillingHallmarkingRole":
                return new BillingHallmarkingRole();
            case "HandCraftRole":
                return new HandCraftRole();
            case "MachineryRole":
                return new MachineryRole();
            case "PolishingRole":
                return new PolishingRole();
            case "BillingManufacturingRole":
                return new BillingManufacturingRole();
            case "GoldSellingRole":
                return new GoldSellingRole();
            case "AccountRole":
                return new AccountRole();
            default:
                return null;
        }
    }}