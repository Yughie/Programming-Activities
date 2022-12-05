
package com.mycompany.programmingexercise1;


public class Rectangle {
    private double height;
    private double width;

    
    public Rectangle() {
        width = 1;  
        height = 1;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        //Area=length×width
        return this.width * this.height;
    }
    
    public double getPerimeter(){
        return 2 * (this.width + this.height) ; 
    }
    
    public void displayInformation(){
        System.out.println("---------------------------------------");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }  
}
