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
public class School extends Building{
    private int numClass;
    private String grade;
    
    public School(double footage, int stories, int numClass, String grade){
        super(footage, stories);
        setNumClass(numClass);
        setGrade(grade);
    }

    public int getNumClass() {
        return numClass;
    }

    public void setNumClass(int numClass) {
        this.numClass = numClass;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSchool{" + "numClass=" + numClass + ", grade=" + grade + '}';
    }
    
    
    
}
