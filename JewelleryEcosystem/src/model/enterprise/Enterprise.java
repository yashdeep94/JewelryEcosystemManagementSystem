/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import model.customer.CustomerDirectory;
import model.order.OrderList;
import model.organization.Organization;
import model.organization.OrganizationDirectory;
import model.product.ProductCatalog;

/**
 *
 * @author YASH
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private CustomerDirectory customerDirectory;
    private OrderList masterOrderList;
    private ProductCatalog products;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;
    public static int count;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        JewelleryShop("JewelleryShop"),
        Hallmarking("Hallmarking"),
        Manufacturing("Manufacturing"),
        Banking("Banking");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
            public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        count++;
        id = count;
        
        
        this.enterpriseType = type;
        organizationDirectory= new OrganizationDirectory();
        customerDirectory = new CustomerDirectory();
        masterOrderList = new OrderList();
        products = new ProductCatalog();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public OrderList getMasterOrderList() {
        return masterOrderList;
    }

    public ProductCatalog getProducts() {
        return products;
    }
}
