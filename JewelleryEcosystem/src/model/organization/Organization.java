/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.organization;

import java.util.ArrayList;
import model.employee.EmployeeDirectory;
import model.order.OrderList;
import model.role.Role;
import model.userAccount.UserAccountDirectory;
import model.workQueue.WorkQueue;

/**
 *
 * @author YASH
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationId;
    private static int counter = 0;
    private OrderList orderList;
    
    public enum Type{
        Gold("Gold Organization"),
        Silver("Silver Organization"),
        Billing("Billing Organization"),
        Security("Security Organization"),
        GoldSelling("GoldSelling Organization"),
        Account("Account Organization"),
        HandCraft("HandCraft Organization"),
        Machinery("Machinery Organization"),
        Polishing("Polishing Organization"),
        Refinery("Refinery Organization"),
        Testing("Testing Organization"),
        StampId("StampId Organization"),
        BillingHallmarking("BillingHallmarking Organization"),
        BillingManufacturing("BillingManufacturing Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationId = counter;
        orderList = new OrderList();
        ++counter;
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public int getOrganizationID() {
        return organizationId;
    }
    
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public OrderList getOrderList() {
        return orderList;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
