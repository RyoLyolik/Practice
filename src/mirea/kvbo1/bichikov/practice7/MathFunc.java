package mirea.kvbo1.bichikov.practice7;

public class MathFunc implements MathCalculable {
    public MathFunc(){}
    @Override
    public double pow(double x, double y) {
        return Math.pow(x,y);
    }

    @Override
    public double abs(Complex z) {
        return Math.sqrt(pow(z.getRe(),2)+pow(z.getIm(), 2));
    }

    public double circlePerimeter(double radius){
        return 2*PI*radius;
    }
    public double circleArea(double radius){
        return PI*radius*radius;
    }
}
