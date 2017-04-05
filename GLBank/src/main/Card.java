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
public class Card {
    
    private int idCard;
    private long cardNumber;
    private long idacc;
    private char blocked;
    private int pin;
    
    public Card(int idCard, long cardNumber,long idacc, char blocked){
        this.idCard=idCard;
        this.cardNumber=cardNumber;
        this.idacc=idacc;
        this.blocked=blocked;
        this.pin=1234;
    }
    
    public Card(int idCard, long cardNumber,long idacc, char blocked,int pin){
        this.idCard=idCard;
        this.cardNumber=cardNumber;
        this.idacc=idacc;
        this.blocked=blocked;
        this.pin=pin;
    }
    //setters
    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setIdacc(long idacc) {
        this.idacc = idacc;
    }

    public void setBlocked(char blocked) {
        this.blocked = blocked;
    }
    //getters
    public int getIdCard() {
        return idCard;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public long getIdacc() {
        return idacc;
    }

    public char getBlocked() {
        return blocked;
    }
    
    
    
}
