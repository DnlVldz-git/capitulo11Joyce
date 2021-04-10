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
public class ElementArray {
    public static void main(String[] args) {
        MetalElement ele1 = new MetalElement("AU", 7, 2.5);
        NonMetalElement ele2 = new NonMetalElement("H", 3, 2.5);
        
        
        System.out.println(ele1.describeElement());
        System.out.println(ele2.describeElement());
    }
}
