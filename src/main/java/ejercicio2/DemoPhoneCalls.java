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
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall i1 = new IncomingPhoneCall("7229807997");
        OutgoingPhoneCall i2 = new OutgoingPhoneCall("7229807997", 20);
        
        System.out.println(i1.getInfo());
        System.out.println(i2.getInfo());
    }
}
