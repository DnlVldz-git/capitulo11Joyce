/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author dani
 */
public class PartTime extends Student{

    public PartTime(String name){
        super(name, false);
    }

    @Override
    public void determineTuiton() {
        System.out.println(super.toString());
        System.out.println("Tuiton is $200");
    }
    
}
