/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Network.Network;
import business.Organisation.Organisation;
import business.Role.Role;
import business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class Ecosystem extends Organisation{
    private static Ecosystem business;
    private ArrayList<Network> networkList;
    
    public static Ecosystem getinstance(){
        if(business == null)
        {
            business = new Ecosystem();
        }
        return business ;
    }
    
    private Ecosystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    public Network createAndAddNetwork(){
        Network network = new  Network();
        networkList.add(network);
        return network;
    }
    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    public void removeNetwork(Network network)
    {
        networkList.remove(network);
    }
    
}
