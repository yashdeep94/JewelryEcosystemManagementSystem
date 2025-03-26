/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.person;

import java.util.ArrayList;

/**
 *
 * @author YASH
 */
public class PersonDirectory {
    private ArrayList<Person> persons;
    
    public PersonDirectory() {
        persons = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person CreateNewPerson(String firstName, String middleName, String lastName, String gender, int age, String emailId, String phoneNumber) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setMiddleName(middleName);
        person.setLastName(lastName);
        person.setGender(gender);
        person.setAge(age);
        person.setEmailId(emailId);
        person.setPhoneNumber(phoneNumber);
        return person;
    }

//    public Iterable<Person> getPersonList() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
}
