/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Driver;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class DriverDirectory {
    private ArrayList<Driver> driverList;
    public DriverDirectory()
    {
        driverList = new ArrayList<>();
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(ArrayList<Driver> driverList) {
        this.driverList = driverList;
    }
    public Driver addDriver()
    {
        Driver d = new Driver();
        driverList.add(d);
        return d;
    }
}
