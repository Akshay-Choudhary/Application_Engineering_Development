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
public class Business {
    private static Business business;

   
    public PharmaDirectory pharmaDirectory;
    public DrugDirectory drugDirectory;
    private MasterInventoryDirectory masterInventoryDirectory;
    
    private Business() {
        pharmaDirectory = new PharmaDirectory();
        masterInventoryDirectory = new MasterInventoryDirectory();
        drugDirectory = new DrugDirectory();
    }
     public static Business getInstanceOf()
     {
         if(business == null)
         {
             Business business = new Business();
             return business;
         }
         else
             return null;
     }

    public PharmaDirectory getPharmaDirectory() {
        return pharmaDirectory;
    }

    public void setPharmaDirectory(PharmaDirectory pharmaDirectory) {
        this.pharmaDirectory = pharmaDirectory;
    }

    public MasterInventoryDirectory getMasterInventoryDirectory() {
        return masterInventoryDirectory;
    }

    public void setMasterInventoryDirectory(MasterInventoryDirectory masterInventoryDirectory) {
        this.masterInventoryDirectory = masterInventoryDirectory;
    }

    
    
}
