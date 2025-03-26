/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.userAccount;

import java.util.ArrayList;
import model.employee.EmployeeProfile;
import model.role.Role;

/**
 *
 * @author YASH
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccounts;

    public UserAccountDirectory() {
        userAccounts = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount userAccount : userAccounts){
            if (userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){
                return userAccount;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, EmployeeProfile employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccounts.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount userAccount : userAccounts){
            if (userAccount.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
