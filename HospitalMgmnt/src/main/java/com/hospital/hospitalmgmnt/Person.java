/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hospital.hospitalmgmnt;

/**
 *
 * @author Divyesh Rajput
 */
public class Person extends House{
    private String pr_name;
    private String pr_gender;
    private String pr_age;
    private String pr_streetAddress;
    private String pr_phone;
    private String pr_email;
    
    

    public String getPr_name() {
        return pr_name;
    }

    public void setPr_name(String pr_name) {
        this.pr_name = pr_name;
    }

    public String getPr_gender() {
        return pr_gender;
    }

    public void setPr_gender(String pr_gender) {
        this.pr_gender = pr_gender;
    }

    public String getPr_age() {
        return pr_age;
    }

    public void setPr_age(String pr_age) {
        this.pr_age = pr_age;
    }

    public String getPr_streetAddress() {
        return pr_streetAddress;
    }

    public void setPr_streetAddress(String pr_streetAddress) {
        this.pr_streetAddress = pr_streetAddress;
    }

    public String getPr_phone() {
        return pr_phone;
    }

    public void setPr_phone(String pr_phone) {
        this.pr_phone = pr_phone;
    }

    public String getPr_email() {
        return pr_email;
    }

    public void setPr_email(String pr_email) {
        this.pr_email = pr_email;
    }
    @Override 
    public String toString(){
        return pr_name;
    }
    
    
}
