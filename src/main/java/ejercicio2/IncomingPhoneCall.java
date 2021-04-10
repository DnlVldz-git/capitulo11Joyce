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
public class IncomingPhoneCall extends PhoneCall{
    
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        this.setPrice(0.02);
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getInfo() {
        return ("Phone nùmber: "+this.phoneNumber+"\nRate per minute: "+this.price+"\nPrice of the call: "+this.price);
    }
    
}
