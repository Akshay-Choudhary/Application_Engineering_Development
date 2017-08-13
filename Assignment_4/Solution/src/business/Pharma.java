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
public class Pharma {
    private String pharmaName;
    private String pharmaDescription;
    private DrugDirectory drugDirectory;
    
    public Pharma(){
        drugDirectory = new DrugDirectory();
       
        
    }

    public DrugDirectory getDrugDirectory() {
        return drugDirectory;
    }

    public void setDrugDirectory(DrugDirectory drugDirectory) {
        this.drugDirectory = drugDirectory;
    }
    

    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public String getPharmaDescription() {
        return pharmaDescription;
    }

    public void setPharmaDescription(String pharmaDescription) {
        this.pharmaDescription = pharmaDescription;
    }

    @Override
    public String toString() {
        return pharmaName;
    }

    
    
}
