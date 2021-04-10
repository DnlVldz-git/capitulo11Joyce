/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author dani
 */
public class UsePlayer {
    public static void main(String[] args) {
        Actor actor = new Actor();
        Child child = new Child();
        Musician musician = new Musician();
        
        actor.play();
        child.play();
        musician.play();
    }
}
