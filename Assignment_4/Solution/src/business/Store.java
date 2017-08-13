/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author aksha
 */
public class Store {
    private String storeName;
    private String area;
    private int zipcode;
    private int storeID;
    private static int count=0;
    private Inventory inv;
    private MasterInventoryDirectory masterInventoryDirectory;

    public MasterInventoryDirectory getMasterInventoryDirectory() {
        return masterInventoryDirectory;
    }

    public void setMasterInventoryDirectory(MasterInventoryDirectory masterInventoryDirectory) {
        this.masterInventoryDirectory = masterInventoryDirectory;
    }
    
    
    
    public Store(){
    count++;
    storeID = count;
    inv = new Inventory();
    masterInventoryDirectory = new MasterInventoryDirectory();
    
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }
   
    

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public String toString() {
        return  storeName ;
    }

   
    
    
}
