/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author dani
 */
public abstract class PhoneCall {
    private String phoneNumber;
    private double price;
    
    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.price = 0;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
}
