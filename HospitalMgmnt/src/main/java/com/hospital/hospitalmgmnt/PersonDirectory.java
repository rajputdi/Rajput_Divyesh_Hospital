/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hospital.hospitalmgmnt;

import java.util.ArrayList;

/**
 *
 * @author Divyesh Rajput
 */
public class PersonDirectory {
    ArrayList<Person> personList;
     public PersonDirectory(){
     this.personList=new ArrayList<Person>();
     }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
     
    public Person createNewPerson(){
    Person newPerson = new Person();
    personList.add(newPerson);
    return newPerson;
    }
    
    public void deletePerson(Person de) {
        personList.remove(de);
    
}
}
