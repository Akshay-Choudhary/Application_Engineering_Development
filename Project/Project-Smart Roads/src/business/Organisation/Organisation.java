/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organisation;

import business.Person.PersonDirectory;
import business.Role.Role;
import business.Sensor.SensorDirectory;
import business.UserAccount.UserAccountDirectory;
import business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public abstract class Organisation {
    private String name;
    private UserAccountDirectory userAccountDir;
    private PersonDirectory personDir;
    private SensorDirectory sensorDir;
    private WorkQueue workQueue;
    private int organisationID;
    private static int count=0;
    
    public enum OrganisationType{
        SensorsOrganisation("SensorOrganisation"),WeatherOrganisation("WeatherOrganisation"),TransportationOrganisation("TransportationOrganisation"),PoliceOrganisation("PoliceOrganisation"),HospitalOrganisation("HospitalOrganisation"),ConstructionOrganisation("ConstructionOrganisation"),DriverOrganisation("DriverOrganisation");
        private String value;
        private OrganisationType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

       
    }
    
    public Organisation(String name){
        this.name = name;
        this.workQueue = new WorkQueue();
        userAccountDir = new UserAccountDirectory();
        personDir = new PersonDirectory();
        sensorDir = new SensorDirectory();
        count++;
        organisationID = count ;
        
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
     public abstract ArrayList<Role> getSupportedRole();

    public int getOrganisationID() {
        return organisationID;
    }

    public void setOrganisationID(int organisationID) {
        this.organisationID = organisationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDir() {
        return userAccountDir;
    }

    public void setUserAccountDir(UserAccountDirectory userAccountDir) {
        this.userAccountDir = userAccountDir;
    }

    public PersonDirectory getPersonDir() {
        return personDir;
    }

    public void setPersonDir(PersonDirectory personDir) {
        this.personDir = personDir;
    }

    public SensorDirectory getSensorDir() {
        return sensorDir;
    }

    public void setSensorDir(SensorDirectory sensorDir) {
        this.sensorDir = sensorDir;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
}
