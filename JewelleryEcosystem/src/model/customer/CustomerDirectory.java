/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.customer;

import java.util.ArrayList;
import model.person.Person;

/**
 *
 * @author trimbkjagtap
 */
public class CustomerDirectory {
    private ArrayList<CustomerProfile> customers;
    
    public CustomerDirectory() {
        customers = new ArrayList<CustomerProfile>();
    }

    public ArrayList<CustomerProfile> getCustomers() {
        return customers;
    }
    
    public CustomerProfile CreateNewCustomer(Person person) {
        CustomerProfile customer = new CustomerProfile(person);
        customers.add(customer);
        return customer;
    }
}
