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
public abstract class Building {
    private double footage;
    private int stories;
    
    public Building(double footage, int stories){
        setFootage(footage);
        setStories(stories);
    }

    @Override
    public String toString() {
        return "Building{" + "footage=" + footage + ", stories=" + stories + '}';
    }
        
    public double getFootage() {
        return footage;
    }

    public void setFootage(double footage) {
        this.footage = footage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }
    
    
    
}
