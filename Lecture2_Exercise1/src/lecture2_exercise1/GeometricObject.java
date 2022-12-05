package lecture2_exercise1;

public class GeometricObject {
    String color;
    boolean filled;
    
    GeometricObject() {
        this.color = "white";
        this.filled = false;             
    }
    
    GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    //GETTER
    public String getColor() {
        return color;
    }
    
    public boolean isFilled() {
        return filled;
    }

    //SETTER
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        return "Color: " + color + " and filled: " + filled;
    } 
}
