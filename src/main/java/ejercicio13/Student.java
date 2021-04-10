/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author dani
 */
public abstract class Student {
    private String name;
    private boolean fullTime;
    
    public Student(String name, boolean fullTime){
        this.name = name;
        this.fullTime = fullTime;
    }
    
    public abstract void determineTuiton();

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", fullTime=" + fullTime + '}';
    }
    
    
    
}
