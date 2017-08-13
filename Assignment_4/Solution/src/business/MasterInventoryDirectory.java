/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class MasterInventoryDirectory {
    private ArrayList<Inventory> inventoryList;
    
    public MasterInventoryDirectory(){
        inventoryList = new ArrayList<>();
    }

    public ArrayList<Inventory> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<Inventory> inventoryList) {
        this.inventoryList = inventoryList;
    }
     public Inventory addInventory(Inventory i) {
        inventoryList.add(i);
        return i;
    }
    
    
}
