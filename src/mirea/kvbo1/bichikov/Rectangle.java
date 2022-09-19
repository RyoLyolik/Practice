package mirea.kvbo1.bichikov;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.type = "Rectangle";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String getType(){
        return this.type;
    }

    @Override
    public double getArea(){
        return this.a*this.b;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.a + this.b);
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\nHeight: " + this.a + "\nWidth: " + this.b;
    }
}
