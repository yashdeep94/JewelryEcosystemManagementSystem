/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.GoldSellingRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class GoldSellingOrganization extends Organization {
    public GoldSellingOrganization() {
        super(Organization.Type.GoldSelling.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new GoldSellingRole());
        return roles;
    }
}
