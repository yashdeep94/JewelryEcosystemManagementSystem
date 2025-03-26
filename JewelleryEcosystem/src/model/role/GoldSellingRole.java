/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.enterprise.Enterprise;
import model.organization.Organization;
import model.userAccount.UserAccount;
import ui.bankingEnterprise.goldSelling.BankingGoldSellingRoleHomeJPanel;

/**
 *
 * @author YASH
 */
public class GoldSellingRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new BankingGoldSellingRoleHomeJPanel(userProcessContainer, account, organization, enterprise, system);
    }
}
