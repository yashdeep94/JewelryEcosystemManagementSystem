/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.role.AccountRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class AccountOrganization extends Organization {
    public AccountOrganization() {
        super(Organization.Type.Account.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<Role>();
        roles.add(new AccountRole());
        return roles;
    }
}
