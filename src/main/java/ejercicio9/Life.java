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
public class Life extends Insurance{
    
    public Life(){
        super("Life");
        setPrice();
    }

    @Override
    public void setPrice() {
        super.price = 36;
    }

    @Override
    public String display() {
        return ("Tipo: "+super.getType()+"\nPrecio: "+super.getPrice());
    }
    
}
