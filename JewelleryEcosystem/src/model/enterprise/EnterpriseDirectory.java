/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import java.util.ArrayList;
import model.enterprise.Enterprise.EnterpriseType;

/**
 *
 * @author YASH
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterprises;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterprises;
    }
    
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterprises = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterprises = new ArrayList<Enterprise>();
    }
    
    public Enterprise createAndAddEnterprise(String name, EnterpriseType type){
        Enterprise enterprise = null;
        if(type == EnterpriseType.JewelleryShop){
            enterprise = new JewelleryShopEnterprise(name);
            enterprises.add(enterprise);
        }
        return enterprise;
    }
}
