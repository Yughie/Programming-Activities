package com.mycompany.programmingexercise2;

public class Stock {
    String symbol, name;
    double previousClosingPrice;
    double currentPrice;

    public Stock() {
        symbol = "Perez";
        name = "Yughie"; 
    }

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    //GETTERS
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
    //SETTERS
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    
    public double getChangePercent(){
        double changePercent = ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
        return changePercent;  
    }
    
    public void displayInformation(){
        System.out.println("------------------------------------");
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Name: " + this.name);
        System.out.println("Previous Closing Price: " + this.previousClosingPrice);
        System.out.println("Current Price " + this.currentPrice);
        System.out.println("Price-change Percentage: " + this.getChangePercent() + "%");
    }
}

