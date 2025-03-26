/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.PolishingRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class PolishingOrganization extends Organization {
    public PolishingOrganization() {
        super(Type.Polishing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new PolishingRole());
        return roles;
    }
}
