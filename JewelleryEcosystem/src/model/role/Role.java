/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.UserAccount;

/**
 *
 * @author YASH
 */
public abstract class Role {
    public enum RoleType{
        Gold("Gold"),
        Silver("Silver"),
        Billing("Billing"),
        Security("Security"),
        GoldSelling("GoldSelling"),
        Account("Account"),
        HandCraft("HandCraft"),
        Machinery("Machinery"),
        Polishing("Polishing"),
        Refinery("Refinery"),
        Testing("Testing"),
        StampId("StampId"),
        BillingHallmarking("BillingHallmarking"),
        BillingManufacturing("BillingManufacturing"),
        AdminJewelleryShop("AdminJewelleryShop"),
        AdminHallmarking("AdminHallmarking"),
        AdminManufacturing("AdminManufacturing"),
        AdminBanking("AdminBanking"),
        SystemAdmin("SystemAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
