/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.Driver.Driver;
import business.Person.Person;
import business.Role.DriverRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class DriverOrganisation extends Organisation{
    private ArrayList<Driver> driverList;
    
    public DriverOrganisation()
    {
        super(OrganisationType.DriverOrganisation.getValue());
        driverList = new ArrayList<>();
    }
    
    public Driver addDriver()
    {
        Driver driver = new Driver();
        driverList.add(driver);
        return driver;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role> roles = new ArrayList<>();
       roles.add(new DriverRole());
       return roles;
    }
    
}
