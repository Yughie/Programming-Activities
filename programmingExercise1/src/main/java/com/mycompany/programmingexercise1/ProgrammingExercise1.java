/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programmingexercise1;

/**
 *
 * @author YUGHIE
 */
public class ProgrammingExercise1 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5,40);
        Rectangle rectangle3 = new Rectangle(3.5,35.9);
        
        
        System.out.println("Rectangle1 area: " + rectangle1.getArea());
        System.out.println("Rectangle1 perimeter: " + rectangle1.getPerimeter());
        
        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());
        
        System.out.println("Rectangle2 area: " + rectangle2.getArea());
        System.out.println("Rectangle2 perimeter: " + rectangle2.getPerimeter());
        
        rectangle1.displayInformation();
        rectangle2.displayInformation();
        rectangle3.displayInformation();
        
        
    }      
}
