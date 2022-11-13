package mirea.kvbo1.bichikov.practice7;

public class Complex {
    private double Im;
    private double Re;

    public Complex(double re, double im){
        this.Re = re;
        this.Im = im;
    }

    public double getIm() {
        return Im;
    }

    public double getRe() {
        return Re;
    }

    public void setIm(double im) {
        Im = im;
    }

    public void setRe(double re) {
        Re = re;
    }
}
