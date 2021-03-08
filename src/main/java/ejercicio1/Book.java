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
public abstract class Book {
    private String title;
    private double price;
    
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }        
    
    public String getTitle(){
        return this.title;
    }
    
    public double getPrice(){
        return this.price;
    } 
    
    public abstract void setPrice();
}
