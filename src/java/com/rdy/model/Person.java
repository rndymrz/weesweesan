/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class Person {

    
    private String name;
    private String job;
    private Date dob;
    private Address address;
    

    public Person(String name, String job, Date dob, Address address) {
        this.name = name;
        this.job = job;
        this.dob = dob;
        this.address = address;
    }

    public Person(String name, String job, Date dob) {
        this.name = name;
        this.job = job;
        this.dob = dob;
    }

    public Person() {
    }
    /**
     * @return the name
     */
    
    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

   

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the dob
     */
    public Date getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
   
    
    
}
