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
public class Client {
    
    private int idc;
    private String lastname;
    private String firstname;
    private String email;
     private String street;
    private int housenumber;
    private String postcode;
     private String username;
      private boolean disable;
      private boolean blocked;

    public Client(int idc, String lastname, String firstname, String email, String street, int housenumber, String postcode, String username, boolean disable, boolean blocked) {
        this.idc = idc;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.street = street;
        this.housenumber = housenumber;
        this.postcode = postcode;
        this.username = username;
        this.disable = disable;
        this.blocked = blocked;
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
    
      
    
    
}
