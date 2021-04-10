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
public class Novel extends Story{
    final Integer NUM_PAGES = 100;
    
    public Novel(String title, String author, Integer numPages){
        super.setTitle(title);
        super.setAuthor(author);        
        setNumPages(numPages);
    }

    @Override
    public void setNumPages(Integer numPages) {
        if (numPages < NUM_PAGES) {
            super.numPages = numPages; 
            super.setMessage((NUM_PAGES-numPages)+" son las páginas que debe añadir para completar el libro");
            System.out.println("Es un número incorrecto de páginas");
        }else{
            super.numPages = numPages; 
        }       
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
