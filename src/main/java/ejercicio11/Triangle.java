/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.GeometricFigure;

/**
 *
 * @author dani
 */
public class Triangle extends GeometricFigure implements SidedObject{

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

    @Override
    public String displaySides() {
        return ("4");
    }
    
    
}

