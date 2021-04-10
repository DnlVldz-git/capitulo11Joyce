/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author dani
 */
public abstract class Auto {
    private String carMaker;
    protected double price;  
        

    public String getCarMaker() {
        return carMaker;
    }

    public void setCarMaker(String carMaker) {
        this.carMaker = carMaker;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice(double price);
    
    
}


