/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.employee;

import model.person.Person;

/**
 *
 * @author YASH
 */
public class EmployeeProfile {
    private Person person;
    private int id;
    private static int count = 1;

    public EmployeeProfile(Person person) {
        id = count;
        this.person = person;
        count++;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return person.getFirstName() + " " + person.getMiddleName() + " " + person.getLastName();
    }
    
    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
}
