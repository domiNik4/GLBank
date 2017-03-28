/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Features;

import java.math.BigInteger;

/**
 *
 * @author D33
 * method relies on correct length account number and prefix in one for now -to be updated.
 */
public class IBANGenerator {
    private String bankCode;
    private String accountNumber;
    private String countryCode="SK";
    private int s=28;
    private int k=20;
    
    
    public IBANGenerator (String bankCode, String accountNumber){
        
        this.bankCode=bankCode;
        this.accountNumber=accountNumber;        
        
    }
    
    public String generateIBAN(){
        String iban = null;
        BigInteger checkDigit;
        if(accountNumber!=null){
           try{
               String temp=bankCode+accountNumber+s+k+"00";
               BigInteger tempValue = new BigInteger(temp);
               BigInteger modulus= tempValue.mod(new BigInteger("97"));
               
               checkDigit=new BigInteger("98").subtract(modulus);
               iban = countryCode+checkDigit+bankCode+accountNumber;  
               
               
           }catch(Exception e){
               System.out.println("Error: "+e.toString());
           }
        }
        return iban;
    }
    
}
