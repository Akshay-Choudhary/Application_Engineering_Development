/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Driver.Driver;
import business.Person.Person;
import business.Role.Role;
import business.Sensor.Sensor;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author aksha
 */
public class UserAccount {
    private String userName;
    private String password;
    private Person person;
    private Role role;
    private Driver driver;
    private WorkQueue workQueue;
    private Sensor sensor;

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
    
    public UserAccount()
    {
        workQueue = new WorkQueue();
        driver = new Driver();
        sensor = new Sensor();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

   

    @Override
    public String toString() {
        return userName;
    }
    
}
