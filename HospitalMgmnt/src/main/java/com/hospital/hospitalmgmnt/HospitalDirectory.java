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
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospital;
    
    public HospitalDirectory(){
        this.hospital = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }
    public Hospital addNewHospital(){
        
        Hospital newHospital = new Hospital();
        hospital.add(newHospital);
        return newHospital;
    }

    public void deleteHospital(Hospital de) {
        hospital.remove(de);
    }

    @Override
    public String toString() {
        return "HospitalDirectory{" + "hospital=" + hospital + '}';
    }
    
}
