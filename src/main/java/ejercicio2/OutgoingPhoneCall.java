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
public class OutgoingPhoneCall extends PhoneCall{
    public Integer mins;
    
    public OutgoingPhoneCall(String phoneNumber, Integer mins){
        super(phoneNumber);
        this.mins = mins;
        this.setPrice(0.04);
        
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
        return ("Phone nùmber: "+this.phoneNumber+"\nMinutes: "+this.mins+"\nRate per minute: "+this.price+"\nPrice of the call: "+(this.price*this.mins));
    }
    
    
}
