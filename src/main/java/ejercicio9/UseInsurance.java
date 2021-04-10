/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;
import java.util.Scanner;

/**
 *
 * @author dani
 */
public class UseInsurance {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("DE VIDA (1)");
        System.out.println("SALUD (2)");
        System.out.println("Introduzca el tipo de seguro que quiera: ");
        int resp = leer.nextInt();
        
        switch (resp) {
            case 1:
                Life life = new Life();
                System.out.println(life.display());
                break;
            case 2:
                Health health = new Health();
                System.out.println(health.display());
                break;
        }
        
        
        
    }
}
