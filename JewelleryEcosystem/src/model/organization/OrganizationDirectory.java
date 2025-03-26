/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.organization.Organization.Type;

/**
 *
 * @author YASH
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizations;

    public OrganizationDirectory() {
        organizations = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizations;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Gold.getValue())){
            organization = new GoldOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Silver.getValue())){
            organization = new SilverOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Billing.getValue())){
            organization = new BillingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Security.getValue())){
            organization = new SecurityOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Refinery.getValue())){
            organization = new RefineryOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Testing.getValue())){
            organization = new TestingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.StampId.getValue())){
            organization = new StampIdOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.BillingHallmarking.getValue())){
            organization = new BillingHallmarkingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.HandCraft.getValue())){
            organization = new HandCraftOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Machinery.getValue())){
            organization = new MachineryOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Polishing.getValue())){
            organization = new PolishingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.BillingManufacturing.getValue())){
            organization = new BillingManufacturingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.GoldSelling.getValue())){
            organization = new GoldSellingOrganization();
            organizations.add(organization);
        }
        else if (type.getValue().equals(Type.Account.getValue())){
            organization = new AccountOrganization();
            organizations.add(organization);
        }
        return organization;
    }
    
    public Organization findOrganization(String name) {
        for(Organization organization: organizations) {
            if (organization.getName().equals(name)){
                return organization;
            }
        }
        return null;
    }
}
