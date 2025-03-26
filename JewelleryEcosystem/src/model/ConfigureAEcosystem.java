/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import dao.EcosystemDAO;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.employee.EmployeeProfile;
import model.enterprise.BankingEnterprise;
import model.enterprise.HallmarkingEnterprise;
import model.enterprise.JewelleryShopEnterprise;
import model.enterprise.ManufacturingEnterprise;
import model.network.Network;
import model.organization.Organization;
import model.person.Person;
import model.person.PersonDirectory;
import model.product.Gold;
import model.product.Product;
import model.role.AccountRole;
import model.role.AdminBankingRole;
import model.role.AdminHallmarkingRole;
import model.role.AdminJewelleryShopRole;
import model.role.AdminManufacturingRole;
import model.role.BillingHallmarkingRole;
import model.role.BillingManufacturingRole;
import model.role.BillingRole;
import model.role.GoldRole;
import model.role.GoldSellingRole;
import model.role.HandCraftRole;
import model.role.MachineryRole;
import model.role.PolishingRole;
import model.role.RefineryRole;
import model.role.SecurityRole;
import model.role.SilverRole;
import model.role.StampIdRole;
import model.role.SystemAdminRole;
import model.role.TestingRole;
import model.userAccount.UserAccount;

import utils.DatabaseConnection;

/**
 *
 * @author YASH
 */
public class ConfigureAEcosystem {
//    public static EcoSystem initialize() {
//        // Creating instance of ecosystem
//        EcoSystem system = new EcoSystem();
//        // Creating instance of network and adding it to created system
//        Network network1 = system.createAndAddNetwork();
//        network1.setName("Jewellery Network");
//        // Creating enterprises
//        JewelleryShopEnterprise jewelleryShopEnterprise = new JewelleryShopEnterprise("JewelleryShopEnterprise");
//        HallmarkingEnterprise hallmarkingEnterprise = new HallmarkingEnterprise("HallmarkingEnterprise");
//        ManufacturingEnterprise manufacturingEnterpeise = new ManufacturingEnterprise("ManufacturingEnterprise");
//        BankingEnterprise bankingEnterprise = new BankingEnterprise("BankingEnterprise");
//        // Adding enterprises to network
//        network1.getEnterpriseDirectory().getEnterpriseList().add(jewelleryShopEnterprise);
//        network1.getEnterpriseDirectory().getEnterpriseList().add(hallmarkingEnterprise);
//        network1.getEnterpriseDirectory().getEnterpriseList().add(manufacturingEnterpeise);
//        network1.getEnterpriseDirectory().getEnterpriseList().add(bankingEnterprise);
//        // Getting person directory
//        PersonDirectory personDirectory = network1.getPersonDirectory();
//        // Creating Persons
//        Person person1 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person2 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person3 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person4 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person5 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person6 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person7 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person8 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person9 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person10 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person11 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person12 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person13 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person14 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person15 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person16 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person17 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person18 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person19 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        // adding home address to person
//        person1.setHomeAddress("abc", 2, "unit 1", "Boston", "MA", "02119", "USA");
//        // Creating employee and system user account
//        EmployeeProfile employee = system.getEmployeeDirectory().createEmployee(person1);
//        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
//        // Setting Gold Price
//        Gold.changeGoldPrice(7800.00);
//        // Creating employee and jwellaryshop enterprise admin user account
//        EmployeeProfile employee1 = jewelleryShopEnterprise.getEmployeeDirectory().createEmployee(person2);
//        jewelleryShopEnterprise.getUserAccountDirectory().createUserAccount("jewelleryadmin", "", employee1, new AdminJewelleryShopRole());
//        // Creating employee and hallmarking enterprise admin user account
//        EmployeeProfile employee2 = hallmarkingEnterprise.getEmployeeDirectory().createEmployee(person3);
//        hallmarkingEnterprise.getUserAccountDirectory().createUserAccount("hallmarkingadmin", "", employee2, new AdminHallmarkingRole());
//        // Creating employee and manufacturing enterprise admin user account
//        EmployeeProfile employee3 = manufacturingEnterpeise.getEmployeeDirectory().createEmployee(person4);
//        manufacturingEnterpeise.getUserAccountDirectory().createUserAccount("manufacturingadmin", "", employee3, new AdminManufacturingRole());
//        // Creating employee and banking enterprise admin user account
//        EmployeeProfile employee4 = bankingEnterprise.getEmployeeDirectory().createEmployee(person5);
//        bankingEnterprise.getUserAccountDirectory().createUserAccount("bankingadmin", "", employee4, new AdminBankingRole());
//        // Creating and adding organizations for jewellery shop enterprise
//        Organization goldOrganization = jewelleryShopEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Gold);
//        Organization silverOrganization = jewelleryShopEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Silver);
//        Organization billingOrganization = jewelleryShopEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Billing);
//        Organization securityOrganization = jewelleryShopEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Security);
//        // Creating employee and gold organization user account
//        EmployeeProfile employee5 = goldOrganization.getEmployeeDirectory().createEmployee(person6);
//        goldOrganization.getUserAccountDirectory().createUserAccount("gold", "", employee5, new GoldRole());
//        // Creating employee and silver organization user account
//        EmployeeProfile employee6 = silverOrganization.getEmployeeDirectory().createEmployee(person7);
//        silverOrganization.getUserAccountDirectory().createUserAccount("silver", "", employee6, new SilverRole());
//        // Creating employee and billing organization user account
//        EmployeeProfile employee7 = billingOrganization.getEmployeeDirectory().createEmployee(person8);
//        billingOrganization.getUserAccountDirectory().createUserAccount("billing", "", employee7, new BillingRole());
//        // Creating employee and billing organization user account
//        EmployeeProfile employee8 = securityOrganization.getEmployeeDirectory().createEmployee(person9);
//        securityOrganization.getUserAccountDirectory().createUserAccount("security", "", employee8, new SecurityRole());
//        // Creating Customers for jewellery shop enterprise
//        Person person20 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person21 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person22 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        Person person23 = personDirectory.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
//        jewelleryShopEnterprise.getCustomerDirectory().CreateNewCustomer(person20);
//        jewelleryShopEnterprise.getCustomerDirectory().CreateNewCustomer(person21);
//        jewelleryShopEnterprise.getCustomerDirectory().CreateNewCustomer(person22);
//        jewelleryShopEnterprise.getCustomerDirectory().CreateNewCustomer(person23);
//        // Creating Products and ading them in jewellery shop enterprise
//        jewelleryShopEnterprise.getProducts().CreateNewProduct(Product.ProductType.Silver, "Silver Product 1", 2, 100);
//        jewelleryShopEnterprise.getProducts().CreateNewProduct(Product.ProductType.Silver, "Silver Product 2", 2, 100);
//        jewelleryShopEnterprise.getProducts().CreateNewProduct(Product.ProductType.Gold, "Gold Product 1", 10, 7, 3, 24, 10, 10);
//        jewelleryShopEnterprise.getProducts().CreateNewProduct(Product.ProductType.Gold, "Gold Product 2", 10, 7, 3, 22, 10, 10);
//        // Creating and adding organizations for hallmarking enterprise
//        Organization refineryOrganization = hallmarkingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Refinery);
//        Organization testingOrganization = hallmarkingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Testing);
//        Organization stampIdOrganization = hallmarkingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.StampId);
//        Organization billingHallmarkingOrganization = hallmarkingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.BillingHallmarking);
//        // Creating employee and refinery organization user account
//        EmployeeProfile employee9 = refineryOrganization.getEmployeeDirectory().createEmployee(person10);
//        refineryOrganization.getUserAccountDirectory().createUserAccount("refinery", "", employee9, new RefineryRole());
//        // Creating employee and testing organization user account
//        EmployeeProfile employee10 = testingOrganization.getEmployeeDirectory().createEmployee(person11);
//        testingOrganization.getUserAccountDirectory().createUserAccount("testing", "", employee10, new TestingRole());
//        // Creating employee and stamp id organization user account
//        EmployeeProfile employee11 = stampIdOrganization.getEmployeeDirectory().createEmployee(person12);
//        stampIdOrganization.getUserAccountDirectory().createUserAccount("stampid", "", employee11, new StampIdRole());
//        // Creating employee and billing organization user account
//        EmployeeProfile employee12 = billingHallmarkingOrganization.getEmployeeDirectory().createEmployee(person13);
//        billingHallmarkingOrganization.getUserAccountDirectory().createUserAccount("billinghallmarking", "", employee12, new BillingHallmarkingRole());
//        // Creating and adding organizations for manufacturing enterprise
//        Organization handcraftOrganization = manufacturingEnterpeise.getOrganizationDirectory().createOrganization(Organization.Type.HandCraft);
//        Organization machineryOrganization = manufacturingEnterpeise.getOrganizationDirectory().createOrganization(Organization.Type.Machinery);
//        Organization polishingOrganization = manufacturingEnterpeise.getOrganizationDirectory().createOrganization(Organization.Type.Polishing);
//        Organization billingManufacturingOrganization = manufacturingEnterpeise.getOrganizationDirectory().createOrganization(Organization.Type.BillingManufacturing);
//        // Creating employee and handcraft organization user account
//        EmployeeProfile employee13 = handcraftOrganization.getEmployeeDirectory().createEmployee(person14);
//        handcraftOrganization.getUserAccountDirectory().createUserAccount("handcraft", "", employee13, new HandCraftRole());
//        // Creating employee and machinery organization user account
//        EmployeeProfile employee14 = machineryOrganization.getEmployeeDirectory().createEmployee(person15);
//        machineryOrganization.getUserAccountDirectory().createUserAccount("machinery", "", employee14, new MachineryRole());
//        // Creating employee and polishing organization user account
//        EmployeeProfile employee15 = polishingOrganization.getEmployeeDirectory().createEmployee(person16);
//        polishingOrganization.getUserAccountDirectory().createUserAccount("polishing", "", employee15, new PolishingRole());
//        // Creating employee and billing organization user account
//        EmployeeProfile employee16 = billingManufacturingOrganization.getEmployeeDirectory().createEmployee(person17);
//        billingManufacturingOrganization.getUserAccountDirectory().createUserAccount("billingmanufacturing", "", employee16, new BillingManufacturingRole());
//        // Creating and adding organizations for banking enterprise
//        Organization goldSellingOrganization = bankingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.GoldSelling);
//        Organization accountOrganization = bankingEnterprise.getOrganizationDirectory().createOrganization(Organization.Type.Account);
//        // Creating employee and handcraft organization user account
//        EmployeeProfile employee17 = goldSellingOrganization.getEmployeeDirectory().createEmployee(person18);
//        goldSellingOrganization.getUserAccountDirectory().createUserAccount("goldselling", "", employee17, new GoldSellingRole());
//        // Creating employee and machinery organization user account
//        EmployeeProfile employee18 = accountOrganization.getEmployeeDirectory().createEmployee(person19);
//        accountOrganization.getUserAccountDirectory().createUserAccount("account", "", employee18, new AccountRole());
//        return system;
//    }
    public static EcoSystem initialize() {
    EcoSystem system = new EcoSystem();
    
    try (Connection conn = DatabaseConnection.getConnection()) {
        Network network1 = EcosystemDAO.fetchNetwork(conn);
        system.getNetworkList().add(network1);
        PersonDirectory pd = network1.getPersonDirectory();
        Person person1 = pd.CreateNewPerson("Abc", "Abc", "Abc", "Male", 25, "xyz@abc", "+1 8888888888");
        EmployeeProfile sysAdmin = system.getEmployeeDirectory().createEmployee(person1);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", sysAdmin, new SystemAdminRole());
        
        EcosystemDAO.fetchEnterprises(conn, network1);
        System.out.print(network1);
        EcosystemDAO.fetchPersons(conn, network1);
        EcosystemDAO.fetchEmployeesAndUserAccounts(conn, system, network1);
//        EcosystemDAO.fetchProducts(conn, network1);
        EcosystemDAO.populateCustomers(network1);
        

        // Set gold price
        Gold.changeGoldPrice(7800.00);

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return system;
}
}
