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
public class MetalElement extends Element{
    
    public MetalElement(String symbol, Integer atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
        
        
    }
    
    @Override
    public String describeElement(){
        return (super.describeElement()+"\nDescripción: Es un metal por lo que es buen conductor de electricidad");
    }
    
}
