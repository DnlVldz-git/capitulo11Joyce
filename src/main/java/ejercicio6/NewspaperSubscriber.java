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
public abstract class NewspaperSubscriber {
    private String subcscriberStreetAddress;
    protected double suscripctionRate;

    public String getSubcscriberStreetAddress() {
        return subcscriberStreetAddress;
    }

    public void setSubcscriberStreetAddress(String subcscriberStreetAddress) {
        this.subcscriberStreetAddress = subcscriberStreetAddress;
    }

    public double getSuscripctionRate() {
        return suscripctionRate;
    }

    public abstract void setSuscripctionRate(double suscripctionRate);

    
    public boolean equals(String address) {
        return this.subcscriberStreetAddress.equals(address); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
