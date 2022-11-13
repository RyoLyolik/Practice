package mirea.kvbo1.bichikov.practice4;

public class Square extends Shape{
    private double a;
    public Square(double a){
        this.a = a;
        this.type = "Square";
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double getArea(){
        return this.a*this.a;
    }
    @Override
    public double getPerimeter(){
        return 4*this.a;
    }
    @Override
    public String getType(){
        return this.type;
    }
    @Override
    public String toString(){
        return "Type: " + this.type + "\nEdge length: " + this.a;
    }
}
