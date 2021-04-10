/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author dani
 */
public abstract class Element {
    private String symbol;
    private Integer atomicNumber;
    private double atomicWeight;
    
    public Element(String symbol, Integer atomicNumber, double atomicWeight){
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public Integer getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }
    
    public String describeElement(){
        return ("Nombre: "+symbol+"\nPeso atómico: "+atomicNumber+"\nPeso atómico"+atomicWeight);
    }
    
}
