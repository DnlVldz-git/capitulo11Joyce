/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author dani
 */
public class UseDivision {
    public static void main(String[] args) {
        InternationalDivision d1 = new InternationalDivision("SpecOps", "A000", "Germany", "German");
        DomesticDivision d2 = new DomesticDivision("NotSoSpecOps", "A001", "México");
        
        System.out.println(d1.display());
        System.out.println(d2.display());
    }
}
