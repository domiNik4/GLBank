/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Client {
    
    private int idc;
    private String lastname;
    private String firstname;
    private String email;
    private String street;
    private Date dob;
    private int housenumber;
    private String postcode;
    private String city;
    private String username;
    private String password;
    private boolean disable;
    private boolean blocked;

    public Client(int idc, String lastname, String firstname, String email, String street, int housenumber, String postcode,String city,String username,String password, boolean disable, boolean blocked,Date dob) {
        this.idc = idc;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.street = street;
        this.housenumber = housenumber;
        this.postcode = postcode;
        this.city=city;
        this.username = username;
        this.password=password;
        this.disable = disable;
        this.blocked = blocked;
        this.dob=dob;
    }
    
    public Client(int idc, String lastname, String firstname, Date dob){
        this.idc=idc;
        this.lastname=lastname;
        this.firstname=firstname;
        this.dob=dob;
        this.email=null;
        this.street=null;
        this.housenumber=0;
        this.postcode=null;
        this.city=null;
        this.username=null;
        this.password=null;
        this.disable=false;
        this.blocked=false;
               
    }
    //getters
    public int getIdc() {
        return idc;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getStreet() {
        return street;
    }

    public int getHousenumber() {
        return housenumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getUsername() {
        return username;
    }

    public boolean isDisable() {
        return disable;
    }

    public boolean isBlocked() {
        return blocked;
    }
    
    public Date getDob(){
        return dob;
    }

    public String getCity() {
        return city;
    }
    
    public String getPassword(){
        return password;
    }
    
    
      
    //setters

    public void setIdc(int idc) {
        this.idc = idc;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHousenumber(int housenumber) {
        this.housenumber = housenumber;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
    
    public void setDob(Date dob){
        this.dob=dob;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
      
    
    
}
