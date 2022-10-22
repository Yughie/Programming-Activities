
package com.mycompany.programmingexercise1;

/**
 *
 * @author YUGHIE
 */
public class Rectangle {
    private double height, width;
    private double area = 0, perimeter = 0;
    private int rectangleCount = 1;
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
        area = this.width * this.height;
        return area;
    }
    
    public double getPerimeter(){
        
        perimeter = (this.width + this.height) * 2;
        return perimeter;
    }
    
    public void displayInformation(){
        System.out.println("---------------------------------------");
        System.out.println("Rectangle - " + rectangleCount );  
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
        rectangleCount++;
    }


    
    
    
    
}
