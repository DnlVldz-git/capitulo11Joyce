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
public class ShortStory extends Story {
    final Integer NUM_PAGES_MAX = 50;

    public ShortStory(String title, String author, Integer numPages) {
        super.setTitle(title);
        super.setAuthor(author);        
        setNumPages(numPages);
    }

    @Override
    public void setNumPages(Integer numPages) {
        if ((numPages < NUM_PAGES_MAX)) {
            super.numPages = numPages;
        } else {
            super.numPages = numPages;
            System.out.println("Es un número incorrecto de páginas");
            super.setMessage((numPages-NUM_PAGES_MAX)+" es el número de páginas que debe agregar para que esté bien");
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    

}
