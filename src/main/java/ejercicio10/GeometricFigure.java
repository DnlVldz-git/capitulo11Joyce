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
public abstract class GeometricFigure {
    private double height;
    private double width;
    private double area;
    
    public GeometricFigure(double height, double width){
        this.height = height;
        this.width = width;        
    }
    
    public abstract void determineArea();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }
    
    public void setArea(double area){
        this.area = area;
    }

    @Override
    public String toString() {
        return "GeometricFigure{" + "height=" + height + ", width=" + width + ", area=" + area + '}';
    }
    
    
}
