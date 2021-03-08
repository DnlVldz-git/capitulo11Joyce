/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author dani
 */
public class BookArray {
    
    public static void main(String[] args) {
        Fiction[] libros1 = new Fiction[5];
        NonFiction[] libros2 = new NonFiction[5];
        
        libros1[0] = new Fiction("Tom Sayer");
        libros1[1] = new Fiction("Juegos del anbre");
        libros1[2] = new Fiction("Diberjent");
        libros1[3] = new Fiction("Mase runer");
        libros1[4] = new Fiction("ai no se");
        
        libros2[0] = new NonFiction("Cronica de una muerte anunciada");
        libros2[1] = new NonFiction("La iliada");
        libros2[2] = new NonFiction("Gatsby");
        libros2[3] = new NonFiction("The 8 mile");
        libros2[4] = new NonFiction("IT");
        
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Fiction: \nTitulo: "+libros1[i].getTitle()+" Precio: "+libros1[i].getPrice());
            System.out.println("Non-Fiction: \nTitulo: "+libros2[i].getTitle()+" Precio: "+libros2[i].getPrice());
        }
    }
    
}
