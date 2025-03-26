/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.role.AdminManufacturingRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class ManufacturingEnterprise extends Enterprise {
    public ManufacturingEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Manufacturing);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminManufacturingRole());
        return roleList;
    }
}
