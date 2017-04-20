/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author pc
 */
public class BankTransaction {
    private int idbt;
    private int amount;
    private String transdatetime;
    private long destacc;
    private int destbank;
    private int idemp;
    
    
    public BankTransaction (int idbt, int amount,String transdatetime, long destacc, int destbank, int idemp){
        this.idbt=idbt;
        this.amount=amount;
        this.transdatetime=transdatetime;
        this.destacc=destacc;
        this.destbank=destbank;
        this.idemp=idemp;
    }

    public void setIdbt(int idbt) {
        this.idbt = idbt;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setTransdatetime(String transdatetime) {
        this.transdatetime = transdatetime;
    }

    public void setDestacc(long destacc) {
        this.destacc = destacc;
    }

    public void setDestbank(int destbank) {
        this.destbank = destbank;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public int getIdbt() {
        return idbt;
    }

    public int getAmount() {
        return amount;
    }

    public String getTransdatetime() {
        return transdatetime;
    }

    public long getDestacc() {
        return destacc;
    }

    public int getDestbank() {
        return destbank;
    }

    public int getIdemp() {
        return idemp;
    }
    
    
}
