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
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;
     public DoctorDirectory(){
     this.doctorList=new ArrayList<Doctor>();
     }

    public ArrayList<Doctor> getdoctorList() {
        return doctorList;
    }

    public void setdoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
     
    public Doctor createNewDoctor(){
    Doctor newDoctor = new Doctor();    
    doctorList.add(newDoctor);
    return newDoctor;
    }
    
    public void deleteDoctor(Doctor de) {
        doctorList.remove(de);
    
}
    
}
