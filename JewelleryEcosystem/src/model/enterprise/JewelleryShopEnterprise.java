/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.role.AdminJewelleryShopRole;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class JewelleryShopEnterprise extends Enterprise {
    public JewelleryShopEnterprise(String name){
        super(name,EnterpriseType.JewelleryShop);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminJewelleryShopRole());
        return roleList;
    }
}
