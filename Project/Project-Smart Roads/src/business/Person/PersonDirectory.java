/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Person;

import java.util.ArrayList;

/**
 *
 * @author aksha
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
    
    public PersonDirectory()
    {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    public Person createAndAddPerson(String name)
    {
        Person person = new Person();
        person.setName(name);
        personList.add(person);
        return person;
    }
}
