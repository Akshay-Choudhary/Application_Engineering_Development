/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author aksha
 */
public class Drug {
    private String drugName;
    private int strength;
    private String specification;
    private int dosageForm;
    private int drugID;
    private int price;
    private String manufacturingDate;
    private String expiryDate;
    private String category;
    private int currentStock;

    
    private static int count=0;
    
    public Drug(){
        count++;
        drugID = count;
       
    }

    public int getDrugID() {
        return drugID;
    }

    

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

   

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }
    
    
    

    @Override
    public String toString() {
        return  drugName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

   

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(int dosageForm) {
        this.dosageForm = dosageForm;
    }

   

   
  
    
    
    
}
