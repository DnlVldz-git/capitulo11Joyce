/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

/**
 *
 * @author dani
 */
public class Novella extends Story{
    final Integer NUM_PAGES_MAX = 100;
    final Integer NUM_PAGES_MIN = 50;
    
    public Novella(String title, String author, Integer numPages){
        super.setTitle(title);
        super.setAuthor(author);        
        setNumPages(numPages);
    }

    @Override
    public void setNumPages(Integer numPages) {
        if ((numPages <= NUM_PAGES_MAX)&&(numPages >= NUM_PAGES_MIN)) {
            super.numPages = numPages;             
        }else if(numPages <= NUM_PAGES_MAX){
            super.numPages = numPages;    
            super.setMessage((numPages-NUM_PAGES_MAX)+"Es el número de páginas que debe agregar");
            System.out.println("Es un número incorrecto de páginas");
        }else if (numPages >= NUM_PAGES_MIN) {
            super.setMessage((NUM_PAGES_MAX-numPages)+"Es el número de páginas que debe quitar");
            System.out.println("Es un número incorrecto de páginas");
        }
       
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}

