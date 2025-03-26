/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.person;

import model.address.Address;

/**
 *
 * @author YASH
 */
public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private int age;
    private Address homeAddress;
    private Address workAddress;
    private String emailId;
    private String phoneNumber;
    private int id;
    public static int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Person() {
        
        count++;
        this.id = count;
        this.homeAddress = new Address();
        this.workAddress = new Address();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String streetName, int streetNumber, String apartment, String city, String state, String zipCode, String country) {
        homeAddress.setStreetName(streetName);
        homeAddress.setStreetNumber(streetNumber);
        homeAddress.setApartment(apartment);
        homeAddress.setCity(city);
        homeAddress.setState(state);
        homeAddress.setZipCode(zipCode);
        homeAddress.setCountry(country);
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String streetName, int streetNumber, String apartment, String city, String state, String zipCode, String country) {
        workAddress.setStreetName(streetName);
        workAddress.setStreetNumber(streetNumber);
        workAddress.setApartment(apartment);
        workAddress.setCity(city);
        workAddress.setState(state);
        workAddress.setZipCode(zipCode);
        workAddress.setCountry(country);
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return this.firstName + this.middleName + this.lastName;
    }
    
}
