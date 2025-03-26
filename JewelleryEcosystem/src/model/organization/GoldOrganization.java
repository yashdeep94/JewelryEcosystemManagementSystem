/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.organization.Organization.Type;
import model.role.GoldRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class GoldOrganization extends Organization {
    public GoldOrganization() {
        super(Type.Gold.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new GoldRole());
        return roles;
    }
}
