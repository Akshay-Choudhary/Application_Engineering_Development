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
public class StoreDirectory {
    private ArrayList<Store> storeList;
    
    public StoreDirectory(){
        storeList = new ArrayList<>();
    }

    public ArrayList<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<Store> storeList) {
        this.storeList = storeList;
    }
    public Store addStore(){
        Store s = new Store();
        storeList.add(s);
        return s;
    }
     public void removeStore(Store s)
    {
        storeList.remove(s);
    }
    
}
