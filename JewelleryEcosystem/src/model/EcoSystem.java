/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.network.Network;
import model.organization.Organization;
import model.role.Role;
import model.role.SystemAdminRole;

/**
 *
 * @author YASH
 */
public class EcoSystem extends Organization {
    private ArrayList<Network> networkList;
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    public EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network findNetwork(String name) {
        for(Network network: networkList) {
            if (network.getName().equals(name)){
                return network;
            }
        }
        return null;
    }
}
