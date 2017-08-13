/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Person.Person;
import business.Role.SystemAdminRole;
import business.Sensor.SensorDirectory;
import business.UserAccount.UserAccount;

/**
 *
 * @author aksha
 */
public class ConfigureSystem {
    public static Ecosystem configure()
    {

    
    Ecosystem system = Ecosystem.getinstance();
    Person person = system.getPersonDir().createAndAddPerson("abc");
    UserAccount ua = system.getUserAccountDir().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
    return system;
    }
}
