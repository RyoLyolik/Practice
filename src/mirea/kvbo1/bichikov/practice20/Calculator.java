package mirea.kvbo1.bichikov.practice20;

public class Calculator {
    public static<T extends Number, V extends Number> double add(T x, V y){
        return x.doubleValue()+y.doubleValue();
    }
    public static<T extends Number, V extends Number> double sub(T x, V y){
        return x.doubleValue()-y.doubleValue();
    }
    public static<T extends Number, V extends Number> double mult(T x, V y){
        return x.doubleValue()*y.doubleValue();
    }
    public static<T extends Number, V extends Number> double div(T x, V y){
        return x.doubleValue()/y.doubleValue();
    }
}
