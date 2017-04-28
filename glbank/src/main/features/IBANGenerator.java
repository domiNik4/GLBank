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
 * this generator works for slovak IBANS only. s and k represent country code values.
 */
public class IBANGenerator {
      
   private String bankCode;
    private String prefix;
    private String accountNumber;
    private String countryCode="SK";
    private int s=28;
    private int k=20;
    
    
    public IBANGenerator (String bankCode, String prefix, String accountNumber){
        
        this.bankCode=bankCode;
        this.prefix=prefix;
        this.accountNumber=accountNumber;        
    }
    
     public String generateIBAN(){
        String iban = null;
        BigInteger checkDigit;
        
        prefix=adjustPrefix();
        accountNumber=adjustAccNumber();
        if(isPrefixValid()&&isAccNumberValid()&&isBankCodeValid()){
           try{
               String temp=bankCode+prefix+accountNumber+s+k+"00";
               BigInteger tempValue = new BigInteger(temp);
               BigInteger modulus= tempValue.mod(new BigInteger("97"));
               
               checkDigit=new BigInteger("98").subtract(modulus);
               if(checkDigit.compareTo(new BigInteger("9"))==1)
                    iban = countryCode+checkDigit+bankCode+prefix+accountNumber;
               else{
                    iban = countryCode+"0"+checkDigit+bankCode+prefix+accountNumber;
                }
               
           }catch(Exception e){
               System.out.println("Error: "+e.toString());
               return null;
           }
        }
        return iban;
    }
    
    private boolean isPrefixValid(){
        boolean containsNumbers=true;
        for(int i=0;i<prefix.length();i++){
            if(!Character.isDigit(prefix.charAt(i)))
                containsNumbers=false;
        }
        if(prefix!=null&&containsNumbers&&prefix.length()<=6){
            return true;
        }
        return false;
    }
    
    private boolean isAccNumberValid(){
        boolean containsNumbers=true;
        for(int i=0;i<accountNumber.length();i++){
            if(!Character.isDigit(accountNumber.charAt(i)))
                containsNumbers=false;
        }
        if(accountNumber!=null&&containsNumbers&&accountNumber.length()<=10){
            return true;
        }
        return false;
    }
    
    private boolean isBankCodeValid(){
        boolean containsNumbers=true;
        for(int i=0;i<bankCode.length();i++){
            if(!Character.isDigit(bankCode.charAt(i)))
                containsNumbers=false;
        }
        if(accountNumber!=null&&containsNumbers&&bankCode.length()==4){
            return true;
        }
        return false;
    }
    
    private String adjustPrefix(){
        StringBuilder prefixStr = new StringBuilder(prefix);
        
        if(isPrefixValid()){
            int numberOfZeros=6-prefix.length();
            for(int i=0;i<numberOfZeros;i++){
                prefixStr.insert(0,'0');
            }
        }
        return prefixStr.toString();
    }
    
    private String adjustAccNumber(){
        StringBuilder accNumberStr = new StringBuilder(accountNumber);
        
        if(isPrefixValid()){
            int numberOfZeros=6-accountNumber.length();
            for(int i=0;i<numberOfZeros;i++){
                accNumberStr.insert(0,'0');
            }
        }
        return accNumberStr.toString();
    }
}
