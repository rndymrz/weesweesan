/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rdy.model;

/**
 *
 * @author user
 */
public class MathResult {

    private String operation;
    private Double result;

    public MathResult() {
    }

    public MathResult(String operation, Double result) {
        this.operation = operation;
        this.result = result;
    }

    
    
    /**
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return the result
     */
    public Double getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(Double result) {
        this.result = result;
    }
    
}

