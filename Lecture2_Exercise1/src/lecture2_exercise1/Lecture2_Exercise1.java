package lecture2_exercise1;


public class Lecture2_Exercise1 {

    public static void main(String[] args) {
       Triangle triangle1 = new Triangle(1,1.5,1, "yellow", true);
       
       System.out.println("Area = " + triangle1.getArea());
       System.out.println("Perimeter = " + triangle1.getPerimeter());
       System.out.println(triangle1.toString());
       System.out.println("Color = " + triangle1.getColor());
       System.out.println("Filled = " + triangle1.isFilled());
        
       
    }
    
}
