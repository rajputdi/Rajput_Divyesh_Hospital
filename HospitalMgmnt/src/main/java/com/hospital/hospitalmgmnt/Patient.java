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
public class Patient extends Person{
    private String patientID;
    
    private ArrayList<Encounter> encounterList = new ArrayList<>();

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }

    public String getPatient_ID() {
        return patientID;
    }

    public void setPatient_ID(String patientID) {
        this.patientID = patientID;
    
    
}
}
