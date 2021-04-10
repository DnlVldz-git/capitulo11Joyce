/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author dani
 */
public class WeekdaySubscriber extends NewspaperSubscriber{

    public WeekdaySubscriber(String address){
        setSuscripctionRate(3.5);
        super.setSubcscriberStreetAddress(address);
    }            

    @Override
    public void setSuscripctionRate(double suscripctionRate) {
        super.suscripctionRate = suscripctionRate;
    }

    public String toString(){
        return ("Dirección: "+super.getSubcscriberStreetAddress()+"\nRate: "+super.getSuscripctionRate()+"\nDescripción: Servicio de entre semana");       
    }
    
    
}
