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
public class PatientDirectory {
    ArrayList<Patient> patientList;

    public PatientDirectory() {
        this.patientList =new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

      public Patient createNewPatient(Patient newPatient){
        
        patientList.add(newPatient);
        return newPatient;
    }   
    
}
