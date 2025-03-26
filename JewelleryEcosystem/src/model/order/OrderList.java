/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.order;

import java.util.ArrayList;
import model.customer.CustomerProfile;

/**
 *
 * @author trimbkjagtap
 */
public class OrderList {
    private ArrayList<Order> orders;
    
    public OrderList() {
        orders = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
    
    public Order CreateNewOrder(CustomerProfile customer) {
        Order order = new Order(customer);
        orders.add(order);
        return order;
    }
    
    public Order findOrder(int id){
        for (Order o:orders){
            if (o.getId() == id){
                return o;
            }
        }
        return null;
    }
}
