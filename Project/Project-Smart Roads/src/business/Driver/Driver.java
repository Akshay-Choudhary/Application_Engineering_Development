/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Driver;

import business.Person.Person;
import java.util.Random;
import javafx.scene.control.RadioButton;

/**
 *
 * @author aksha
 */
public class Driver extends Person {
    private Random rand = new Random();
    private String driverName;
    private String male;
    private String female;
    private String address1;
    private String address2;
    private String email;
    private double licenseNumber = rand.nextDouble()*100;

    
    
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    private String dateOfBirth;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }
   

     public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getFemale() {
        return female;
    }

    public void setFemale(String female) {
        this.female = female;
    }
    
  

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(double licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return driverName;
    }

    

    
    
    
}
