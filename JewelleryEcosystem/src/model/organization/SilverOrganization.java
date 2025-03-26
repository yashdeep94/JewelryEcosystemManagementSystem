/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.Role;
import model.role.SilverRole;

/**
 *
 * @author YASH
 */
public class SilverOrganization extends Organization {
    public SilverOrganization() {
        super(Organization.Type.Silver.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new SilverRole());
        return roles;
    }
}
