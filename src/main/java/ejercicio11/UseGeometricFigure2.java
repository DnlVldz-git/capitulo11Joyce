/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author dani
 */
public class UseGeometricFigure2 {
    public static void main(String[] args) {
        Square square = new Square(2,2);
        Triangle triangle = new Triangle(2,3);
        
        System.out.println(square+"\nlados: "+square.displaySides());
        System.out.println(triangle+"\nlados: "+triangle.displaySides());
        
        
        
    }
}
