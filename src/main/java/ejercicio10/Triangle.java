/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author dani
 */
public class Triangle extends GeometricFigure{

    public Triangle(double height, double width){
        super(height, width);
        determineArea();
    }

    @Override
    public void determineArea() {
        super.setArea((super.getHeight()*super.getWidth())/2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
