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
public class DrugDirectory {
    private ArrayList<Drug> drugList;
    
    public DrugDirectory(){
        drugList = new ArrayList<>();
    
}

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    } 
    public Drug addDrug()
    {
        Drug d = new Drug();
        drugList.add(d);
        return d;
    }
    public Drug searchDrug(String drugName) {
        for (Drug d : drugList) {

            if (drugName == d.getDrugName()) {
                return d ;
            }
        }
        return null;
    }
    public void removeDrug(Drug d){
        drugList.remove(d);
    }
    
}
