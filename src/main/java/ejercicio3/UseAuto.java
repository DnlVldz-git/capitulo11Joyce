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
public class UseAuto {
    public static void main(String[] args) {
        Ford auto1 = new Ford(2000);
        Chevy auto2 = new Chevy(1500);
        
        System.out.println("Car maker: "+auto1.getCarMaker()+"\nPrice: "+auto1.getPrice());
        System.out.println("Car maker: "+auto2.getCarMaker()+"\nPrice: "+auto2.getPrice());
    }
    
}
