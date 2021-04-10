/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

import ejercicio14.House;
import ejercicio14.School;

/**
 *
 * @author dani
 */
public class CreateBuildings {
    public static void main(String[] args) {
        House house = new House(12.2, 2, 2, 2);
        School school = new School(12.3 ,2, 2,"PRimaria");
        
        System.out.println(house);
        System.out.println(school);
    }
}
