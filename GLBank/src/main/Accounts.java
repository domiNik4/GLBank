/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.math.BigInteger;

/**
 *
 * @author pc
 */
public class Accounts {
    private int idc;
    private long idAcc;
    private float balance;
    
    public Accounts(int idc, long idAcc, float balance){
        this.idc=idc;
        this.idAcc=idAcc;
        this.balance=balance;
        
    }

    public int getIdc() {
        return idc;
    }

    public long getIdAcc() {
        return idAcc;
    }

    public float getBalance() {
        return balance;
    }
    
    
    
            
    
}
