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
public class Square extends GeometricFigure{
    
    public Square(double height, double width){
        super(height, width);
        determineArea();
    }

    @Override
    public void determineArea() {
        super.setArea(super.getHeight()*super.getWidth());
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
