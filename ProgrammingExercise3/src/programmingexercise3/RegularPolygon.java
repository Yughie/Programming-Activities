package programmingexercise3;

public class RegularPolygon {
    private int n;
    private double side;
    private double x; 
    private double y;
    
    public RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    
    /**
     *
     * @param n
     * @param side
     */
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }
    
    public RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter(){
        return this.side * this.n;
    }
    
    public double getArea(){
        double area;
        area = (this.n * Math.pow(this.side, 2) / 4 * Math.tan((getPerimeter()/this.n)));
        return area;
    }
    
    
    
}
