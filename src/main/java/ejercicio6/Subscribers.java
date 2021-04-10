/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;
/**
 *
 * @author dani
 */
public class Subscribers {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("SERVICIO DE 7 DÍAS (1)");
        System.out.println("SERVICIO DE ENTRE SEMANA (2)");
        System.out.println("SERVICIO DE FIN DE SEMANA (3)");
        System.out.println("Qué tipo de servicio desea? (1,2,3)");
        
        int resp = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduzca su dirección porfavor");
        
        String address = leer.nextLine();
        
        
        
        switch (resp) {
            case 1:
                SevenDaySubscriber susSeven = new SevenDaySubscriber(address);
                System.out.println("Información de su suscripción: ");
                System.out.println(susSeven.toString());
                break;
            case 2:
                WeekdaySubscriber susWeek = new WeekdaySubscriber(address);
                System.out.println("Información de su suscripción: ");
                System.out.println(susWeek.toString());
                break;                
            case 3:
                WeekendSubscriber susEnd = new WeekendSubscriber(address);
                System.out.println("Información de su suscripción: ");
                System.out.println(susEnd.toString());
                break;
        }
        
        
        
        
    }
    
}
