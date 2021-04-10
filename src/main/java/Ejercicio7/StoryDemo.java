/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class StoryDemo {
    public static void main(String[] args) {
        ArrayList<Novel> novelas = new ArrayList();
        ArrayList<Novella> novellas = new ArrayList();
        ArrayList<ShortStory> cuentos = new ArrayList();
        
        novelas.add(new Novel("Pocahontas", "No sé", 101));
        novelas.add(new Novel("Después del funeral", "No sé", 99));
        
        novellas.add(new Novella("Pichin", "No sé", 60));
        novellas.add(new Novella("xd", "No sé", 40));
        
        cuentos.add(new ShortStory("TOmmy", "No sé", 40));
        cuentos.add(new ShortStory("Tommy 2", "No sé", 100));
        
        
        for (Novel novela : novelas) {
            System.out.println(novela);
        }
        
        for (Novella novella : novellas) {
            System.out.println(novellas);
        }
        
        for (ShortStory cuento : cuentos) {
            System.out.println(cuento);
        }
        
    }
}
