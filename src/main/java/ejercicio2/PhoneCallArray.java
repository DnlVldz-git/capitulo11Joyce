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
public class PhoneCallArray {
    public static void main(String[] args) {
        IncomingPhoneCall[] i1 = new IncomingPhoneCall[5];
        OutgoingPhoneCall[] i2 = new OutgoingPhoneCall[5];
        
        i1[0] = new IncomingPhoneCall("722987997");
        i1[1] = new IncomingPhoneCall("722987996");
        i1[2] = new IncomingPhoneCall("722987995");
        i1[3] = new IncomingPhoneCall("722987994");
        i1[4] = new IncomingPhoneCall("722987993");
        
        i2[0] = new OutgoingPhoneCall("722987992", 20);
        i2[1] = new OutgoingPhoneCall("722987991", 30);
        i2[2] = new OutgoingPhoneCall("722987990", 40);
        i2[3] = new OutgoingPhoneCall("722987989", 50);
        i2[4] = new OutgoingPhoneCall("722987988", 60);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Incoming");
            System.out.println(i1[i].getInfo());
            System.out.println("Outgoing");
            System.out.println(i2[i].getInfo());
        }
 
        
    }
    
}
