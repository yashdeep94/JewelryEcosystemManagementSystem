/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.BillingHallmarkingRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class BillingHallmarkingOrganization extends Organization {
    public BillingHallmarkingOrganization() {
        super(Type.BillingHallmarking.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new BillingHallmarkingRole());
        return roles;
    }
}
