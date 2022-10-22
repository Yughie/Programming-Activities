package com.mycompany.programmingexercise2;

public class ProgrammingExercise2 {

    public static void main(String[] args) {
        Stock stock1 = new Stock();
        Stock stock2 = new Stock("Java", "Sun Microsystems Inc", 4.5, 4.35 );
        
        System.out.println(stock2.getName());
        System.out.println(stock1.getSymbol() + " Price-Change Percentage: " + stock1.getChangePercent());
        System.out.println(stock2.getSymbol() + " Price-Change Percentage: " + stock2.getChangePercent());
        stock1.displayInformation();
        stock2.displayInformation();
        
    }
}
