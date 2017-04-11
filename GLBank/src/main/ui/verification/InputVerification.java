/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ui.verification;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class InputVerification {
    
    //check client credentials
    public boolean isNameValid(String name,javax.swing.JLabel lblError){
        boolean valid=false;
        if(name!=null&&name.length()>=2&&name.length()<=20){
            for(int i=0;i<2;i++){
                if(Character.isLetter(name.charAt(i)))
                    valid=true;
                else
                    valid=false;
            }
            for(int i=2;i<name.length()-2;i++){
                if(Character.isLetter(name.charAt(i))||(name.charAt(i)=='-')||(name.charAt(i)==' '))
                    valid=true;
                else
                    valid=false;
            }
            for(int i=name.length()-2;i<name.length();i++){
                if(Character.isLetter(name.charAt(i)))
                    valid=true;
                else
                    valid=false;
            }
        }
        if(valid==false)
           lblError.setVisible(true);
        return valid;
    }
    
    public boolean isDobValid( Date dob,javax.swing.JLabel lblError ){
        boolean valid=false;
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        SimpleDateFormat yr = new SimpleDateFormat("yyyy");
 
        String dateOfBirth=df.format(dob);
        int year=Integer.parseInt(yr.format(dob));
     
        if(dateOfBirth!=null&&year<2001)
            valid=true;
        if (valid==false)
                lblError.setVisible(true);
        return valid;
    }
    
    public boolean isEmailValid(String email,javax.swing.JLabel lblError){

        boolean valid=false;
        
        if(email!=null&&email.length()>5 /*altered for testing purposes*/)
            valid=true;
        
        if (valid==false)
            lblError.setVisible(true);
        return valid;
    }
    
    public boolean isStreetValid(String street,javax.swing.JLabel lblError){

        boolean valid=false;
        if(street!=null&&street.length()<=30){
            for(int i=0;i<street.length();i++){
                if(Character.isLetter(street.charAt(i)))
                        valid=true;
                    
            }
        }
        if(valid==false)
            lblError.setVisible(true);
        
        return valid;
    }
    
    public boolean isStreetNumberValid(String streetnumber,javax.swing.JLabel lblError){
        boolean valid =false;
        if(streetnumber!=null){
            for(int i=0;i<streetnumber.length();i++){
                if(Character.isDigit(streetnumber.charAt(i)))
                    valid=true;
                
            }
        }
        if(valid==false){
            lblError.setVisible(true);
        }
        return valid;
    }
    
    public boolean isPostcodeValid(String postCode,javax.swing.JLabel lblError){
        boolean valid=false;
        if(postCode!=null&&postCode.length()==5){
            for(int i=0;i<postCode.length();i++){
                if(Character.isDigit(postCode.charAt(i)))
                        valid=true;
                    
            }
        }
        if(valid==false){
            lblError.setVisible(true);
        }
        return valid;
    }
    
    public boolean isCityValid(String city, javax.swing.JLabel lblError){
        boolean valid=false;
        if(city!=null&&city.length()<=20){
            for(int i=0;i<city.length();i++){
                if(Character.isLetter(city.charAt(i)))
                        valid=true;
            }
        }
         if(valid==false){
            lblError.setVisible(true);
        }
        return valid;
    }
    
    public boolean isUsernameValid(String username,javax.swing.JLabel lblError){

        boolean valid=false;
        if(username!=null&&username.length()<=20&&username.length()>2){
            for(int i=0;i<username.length();i++){
                if(Character.isLetter(username.charAt(i))||Character.isDigit(username.charAt(i)))
                        valid=true;
                else
                    valid=false;
            }
        }
        if(valid==false){
            lblError.setVisible(true);
        }
        return valid;
    }
    
    public boolean isPasswordValid(String password,javax.swing.JLabel lblError ){
        
        if(password!=null&&password.length()>5&&(!password.contains(" "))){
            return true;
        }else{
            lblError.setVisible(true);
            return false;
        }
    }
    
    //check number input fields -to be added
    
   
    
}

