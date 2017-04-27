/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Date;

/**
 *
 * @author D33
 */
public class CashTransaction {
    private int id;
    private int idemp;
    private float amount;
    private Date date;
    
    public CashTransaction(int id, int idemp,float amount,Date date){
        this.id=id;
        this.idemp=idemp;
        this.amount=amount;
        this.date=date;        
    }

    public int getId() {
        return id;
    }

    public int getIdemp() {
        return idemp;
    }

    public float getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
    
    
}
