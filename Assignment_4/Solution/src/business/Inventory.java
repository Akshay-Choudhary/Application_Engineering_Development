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
public class Inventory {
    private static int count=0;
    private ArrayList<InventoryItem> inventoryList;
    private int inventoryNumber;
    
    public Inventory(){
        count++;
        inventoryNumber = count;
        inventoryList = new ArrayList<>();
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }
     public void removeInventoryItem(InventoryItem i) {
        inventoryList.remove(i);
    }
      public InventoryItem addInventoryItem(Drug p, int q, int price) {
        InventoryItem i = new InventoryItem();
        i.setDrug(p);
        i.setStock(q);
        i.setSalesPrice(price);
        inventoryList.add(i);
        return i;
    }

    public ArrayList<InventoryItem> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(ArrayList<InventoryItem> inventoryList) {
        this.inventoryList = inventoryList;
    }
    
    
    
    
}
