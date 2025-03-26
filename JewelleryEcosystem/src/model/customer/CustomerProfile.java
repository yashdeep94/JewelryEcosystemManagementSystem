/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.customer;

import model.person.Person;

/**
 *
 * @author trimbkjagtap
 */
public class CustomerProfile {
    private Person person;
    private int id;
    private static int count = 1;

    public CustomerProfile(Person person) {
        id = count;
        this.person = person;
        count++;
    }

    public int getId() {
        return id;
    }
    
    public Person getPerson() {
        return person;
    }
    
    @Override
    public String toString() {
        return person.getFirstName() + " " + person.getMiddleName() + " " + person.getLastName();
    }
}