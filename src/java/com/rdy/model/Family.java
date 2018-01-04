/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

import java.util.List;

/**
 *
 * @author user
 */
public class Family {
    
    private String marga;
    private List<Person> members;

    public Family() {
    }

    public Family(String marga, List<Person> members) {
        this.marga = marga;
        this.members = members;
    }
    

    /**
     * @return the marga
     */
    public String getMarga() {
        return marga;
    }

    /**
     * @param marga the marga to set
     */
    public void setMarga(String marga) {
        this.marga = marga;
    }

    /**
     * @return the members
     */
    public List<Person> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(List<Person> members) {
        this.members = members;
    }
    
    
}
