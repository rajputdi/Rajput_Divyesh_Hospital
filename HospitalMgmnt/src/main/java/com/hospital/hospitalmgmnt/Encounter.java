/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hospital.hospitalmgmnt;

import java.util.Date;

/**
 *
 * @author Divyesh Rajput
 */
public class Encounter{
    
    private String visit_ID;
    private Date timestamp;
    private VitalSign vs;


    public String getVisit_ID() {
        return visit_ID;
    }

    public void setVisit_ID(String visit_ID) {
        this.visit_ID = visit_ID;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public VitalSign getVs() {
        return vs;
    }

    public void setVs(VitalSign vs) {
        this.vs = vs;
    }
    
    
}
