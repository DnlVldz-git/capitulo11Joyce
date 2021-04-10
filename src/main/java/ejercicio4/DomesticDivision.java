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
public class DomesticDivision extends Division{
    private String country;
    
    public DomesticDivision(String name, String number, String country){
        super(name, number);
        this.country = country;
    }

    @Override
    public String display() {
        return ("Name: "+this.getName()+"\nNumber: "+this.getNumber()+"\nCountry: ");
    }
    
}
