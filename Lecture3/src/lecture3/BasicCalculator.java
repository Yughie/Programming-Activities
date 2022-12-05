package lecture3;


public class BasicCalculator extends BasicMathOperation implements NumberInterfaceListener{
    
    double num1;
    double num2;
    double result;
    
    @Override
    public void add(){
        result = num1 + num2;
    }
    
    @Override
    public void subtract(){
        result = num1 - num2;
    }
    
    @Override
    public void divide(){
        result = num1 / num2;
    }
    
    @Override
    public void multiply(){
        result = num1 * num2;
    }
    
    @Override
    public void setNumber(double n1, double n2){
        num1 = n1;
        num2 = n2;
    }
    
    @Override
    public double getNumber(){
        return result;
    }
}
