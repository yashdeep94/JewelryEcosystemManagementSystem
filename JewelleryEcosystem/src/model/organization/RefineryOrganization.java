/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.RefineryRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class RefineryOrganization extends Organization {
    public RefineryOrganization() {
        super(Type.Refinery.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new RefineryRole());
        return roles;
    }
}
