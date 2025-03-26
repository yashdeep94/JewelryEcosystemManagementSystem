/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.role.AdminBankingRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class BankingEnterprise extends Enterprise {
    public BankingEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Banking);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminBankingRole());
        return roleList;
    }
}
