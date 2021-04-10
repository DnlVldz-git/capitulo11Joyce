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
public abstract class Story {
    private String title;
    private String author;
    protected Integer numPages;
    private String Message;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getNumPages(){
        return numPages;
    }          

    public abstract void setNumPages(Integer numPages);

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    @Override
    public String toString() {
        return "Story{" + "title=" + title + ", author=" + author + ", numPages=" + numPages + ", Message=" + Message + '}';
    }
    
    
    
    
}
