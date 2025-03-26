/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.userAccount;

import model.employee.EmployeeProfile;
import model.role.Role;
import model.workQueue.WorkQueue;

/**
 *
 * @author YASH
 */
public class UserAccount {
    private int id;
    private String username;
    private String password;
    private EmployeeProfile employee;
    private Role role;
    private WorkQueue workQueue;
    
    public UserAccount() {
        workQueue = new WorkQueue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public EmployeeProfile getEmployee() {
        return employee;
    }
    
    public void setEmployee(EmployeeProfile employee) {
        this.employee = employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}
