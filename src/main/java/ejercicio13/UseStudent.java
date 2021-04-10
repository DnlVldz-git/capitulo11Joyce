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
public class UseStudent {
    public static void main(String[] args) {
        FullTime full = new FullTime("David");
        PartTime part = new PartTime("Jorge");
        
        full.determineTuiton();
        part.determineTuiton();
    }
    
    
}
