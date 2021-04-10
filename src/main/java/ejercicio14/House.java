/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author dani
 */
public class House extends Building{
    private int bedrooms;
    private int baths;
    
    public House(double footage, int stories, int bed, int bath){
        super(footage, stories);
        setBedrooms(bed);
        setBaths(bath);
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHouse{" + "bedrooms=" + bedrooms + ", baths=" + baths + '}';
    }
    
    
    
}
