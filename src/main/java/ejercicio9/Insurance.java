/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author dani
 */
public abstract class Insurance {
    private String type;
    protected double price;
    
    public Insurance(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract void setPrice();
    
    public abstract String display();
    
}
