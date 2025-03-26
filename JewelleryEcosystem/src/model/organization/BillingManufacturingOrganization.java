/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.BillingManufacturingRole;
import model.role.Role;

/**
 *
 * @author trimbkjagtap
 */
public class BillingManufacturingOrganization extends Organization {
    public BillingManufacturingOrganization() {
        super(Organization.Type.BillingManufacturing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new BillingManufacturingRole());
        return roles;
    }
}
