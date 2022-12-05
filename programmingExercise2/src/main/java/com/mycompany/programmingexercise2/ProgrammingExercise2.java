package com.mycompany.programmingexercise2;

public class ProgrammingExercise2 {

    public static void main(String[] args) {

        Stock stock1 = new Stock("Java", "Sun Microsystems Inc", 4.5);
        
        stock1.setCurrentPrice(4.35);
        
        System.out.println("Price-change Percentage: " + stock1.getChangePercent() +"%\n");
        stock1.displayInformation(); 

    }
}
