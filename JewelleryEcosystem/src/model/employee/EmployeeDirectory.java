/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

import java.util.ArrayList;
import model.person.Person;

/**
 *
 * @author YASH
 */
public class EmployeeDirectory {
    private ArrayList<EmployeeProfile> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<EmployeeProfile>();
    }

    public ArrayList<EmployeeProfile> getEmployeeList() {
        return employees;
    }
    
    public EmployeeProfile createEmployee(Person person){
        EmployeeProfile employee = new EmployeeProfile(person);
        employees.add(employee);
        return employee;
    }
}
