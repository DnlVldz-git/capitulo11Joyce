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
public class InternationalDivision extends Division{
    private String country;
    private String language;
    
    public InternationalDivision(String name, String number,String country, String language){
        super(name, number);
        this.country = country;
        this.language = language;
    }
    
    
    @Override
    public String display() {
       return ("Name: "+this.getName()+"\nNumber: "+this.getNumber()+"\nCountry: "+this.country+"\nLanguage: "+this.language);
    }
    
}
