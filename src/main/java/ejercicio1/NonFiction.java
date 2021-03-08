/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani
 */
public class NonFiction extends Book{
    
    public NonFiction(String title){
        super(title, 0);
        this.setPrice();
    }

    @Override
    public void setPrice() {
        this.setPrice(37.99);
    }
   
}
