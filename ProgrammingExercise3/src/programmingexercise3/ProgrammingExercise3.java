package programmingexercise3;

public class ProgrammingExercise3 {


    public static void main(String[] args) {
        // TODO code application logic here
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6,4);
        RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
        

        System.out.println(polygon1.getPerimeter());
        System.out.println(polygon1.getArea());
        
        System.out.println(polygon2.getPerimeter());
        System.out.println(polygon2.getArea());
        
        System.out.println(polygon3.getPerimeter());
        System.out.println(polygon3.getArea());
        

    }
    
}
