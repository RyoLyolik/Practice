package mirea.kvbo1.bichikov.practice20;

import java.io.Serializable;

public class Generalized<T extends Comparable<T>,V extends Serializable,K> {
    T t; V v; K k;
    public Generalized(T t, V v, K k){
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public String typesInString(){
        return "T type: " + this.t.getClass() + "\nV type: " + this.v.getClass() + "\nK type: " + this.k.getClass();
    }
}
