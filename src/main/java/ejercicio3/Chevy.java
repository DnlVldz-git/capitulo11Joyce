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
public class Chevy extends Auto{

    public Chevy(double price){
        super.setCarMaker("Chevy");
        this.setPrice(price);
    }
    
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    
}
