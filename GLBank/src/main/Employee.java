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
public class Employee {
    
    private int idemp;
    private String firstname;
    private String lastname;
    private String email;
    private char position;

    public Employee(int idemp, String firstname, String lastname, String email, char position) {
        this.idemp = idemp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.position = position;
    }
    //getters
    public int getIdemp() {
        return idemp;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public char getPosition() {
        return position;
    }
    //setters
    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(char position) {
        this.position = position;
    }
    
    
    
    
}
