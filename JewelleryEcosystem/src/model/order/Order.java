/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.order;

import java.util.ArrayList;
import model.customer.CustomerProfile;
import model.product.Product;

/**
 *
 * @author trimbkjagtap
 */
public class Order {
    private ArrayList<Product> productList;
    private CustomerProfile customer;
    private int id;
    private String status; 
    private static int count = 1;
    private double tax = 3.3;
    private Boolean sell = true;

    public Order(CustomerProfile customer) {
        id = count;
        this.status = "Payment Pending";
        this.customer = customer;
        this.productList = new ArrayList<Product>();
        count++;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }
    
    public int getId() {
        return this.id;
    }

    public Boolean getSell() {
        return sell;
    }

    public void setSell(Boolean sell) {
        this.sell = sell;
    }
    
    public double getTotalPriceWithoutTax() {
        double total = 0;
        for (Product product: productList) {
            total += product.getPrice();
        }
        if (!sell) {
            return total * -1;
        }
        return total;
    }
    
    public double getCalculatedTax() {
        return getTotalPriceWithoutTax() * (this.tax / 100.0);
    }
    
    public double getTotalPrice() {
        return getCalculatedTax() + getTotalPriceWithoutTax();
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
