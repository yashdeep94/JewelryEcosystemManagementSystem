/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.Role;
import model.role.StampIdRole;

/**
 *
 * @author YASH
 */
public class StampIdOrganization extends Organization {
    public StampIdOrganization() {
        super(Type.StampId.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new StampIdRole());
        return roles;
    }
}
