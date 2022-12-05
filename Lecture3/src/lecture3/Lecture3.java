package lecture3;

public class Lecture3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        BasicCalculator calc1 = new BasicCalculator();
        
        calc1.setNumber(50.0, 70.0);
        calc1.add();
        System.out.println("Addition: " + calc1.getNumber());
        
        calc1.setNumber(15.0, 1.5);
        calc1.multiply();
        System.out.println("Multiplication: " + calc1.getNumber());
        
        calc1.setNumber(120.0, 30.0);
        calc1.divide();
        System.out.println("Division: " + calc1.getNumber());
        
        calc1.setNumber(180.0, 30.5);
        calc1.subtract();
        System.out.println("Subtraction: " + calc1.getNumber());  
    }  
}
