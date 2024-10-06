/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author mayurshiroya
 */
public class PersonDirectory {
    private ArrayList<Person> personlist;
    
    public PersonDirectory(){
    this.personlist=new ArrayList<Person>();
    }
    
    public void addPerson(Person p) {
        personlist.add(p);
        
    }

    public ArrayList<Person> getPersonList() {
        return personlist;
    }

    public Person searchByFirstName(String firstName) {
        for (Person p : personlist) {
            if (p.getfName().equalsIgnoreCase(firstName)) {
                return p;
            }
        }
        return null;
    }

    public Person searchByLastName(String lastName) {
        for (Person p : personlist) {
            if (p.getLname().equalsIgnoreCase(lastName)) {
                return p;
            }
        }
        return null;
    }

    public Person searchByStreetAddress(String street) {
        for (Person p : personlist) {
            if (p.getHomeAddress().getStreetadd().equalsIgnoreCase(street)) {
                return p;
            }
        }
        return null;
    }

    public void deletePerson(Person p) {
        personlist.remove(p);
    }
}
    
    

