/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.network;

import model.enterprise.EnterpriseDirectory;
import model.person.PersonDirectory;

/**
 *
 * @author YASH
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private PersonDirectory personDirectory;
    
    public Network(){
        enterpriseDirectory = new EnterpriseDirectory();
        personDirectory = new PersonDirectory();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
