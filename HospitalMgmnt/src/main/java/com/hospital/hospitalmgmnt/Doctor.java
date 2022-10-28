/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hospital.hospitalmgmnt;

/**
 *
 * @author Divyesh Rajput
 */
public class Doctor {
    private String drID;
    private String drName;
    private String drSpeciality;
    private String drHospital;
    private String drContact;

    public String getDrHospital() {
        return drHospital;
    }

    public void setDrHospital(String drHospital) {
        this.drHospital = drHospital;
    }

    public String getdrID() {
        return drID;
    }

    public void setdrID(String drID) {
        this.drID = drID;
    }

    public String getdrName() {
        return drName;
    }

    public void setdrName(String drName) {
        this.drName = drName;
    }

    public String getDrSpeciality() {
        return drSpeciality;
    }

    public void setDrSpeciality(String drSpeciality) {
        this.drSpeciality = drSpeciality;
    }

    public String getDrContact() {
        return drContact;
    }

    public void setDrContact(String drContact) {
        this.drContact = drContact;
    }
    
    @Override 
    public String toString(){
        return drID;
    }


    
    
}
