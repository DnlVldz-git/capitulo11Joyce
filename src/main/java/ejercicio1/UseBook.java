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
public class UseBook {
    public static void main(String[] args) {
        Fiction book1 = new Fiction("Lors");
        NonFiction book2 = new NonFiction("Beni");
        
        System.out.println("Fiction: Price: "+book1.getPrice()+", Title: "+book1.getTitle());
        System.out.println("Non-Fiction: Price: "+book2.getPrice()+", Title: "+book2.getTitle());
    }
}
