package mirea.kvbo1.bichikov.practice20;

public class MinMax <T extends Comparable<T>>{
    T[] array;
    public MinMax(T[] array){
        this.array = array;
    }

    public T min(){
        int n = this.array.length;
        T el = null;
        if (n > 0){
            el = this.array[0];
            for (int i = 1; i < n; i++){
                el = (this.array[i].compareTo(el) < 0) ? this.array[i] : el;
            }
        }
        return el;
    }

    public T max(){
        int n = this.array.length;
        T el = null;
        if (n > 0){
            el = this.array[0];
            for (int i = 1; i < n; i++){
                el = (this.array[i].compareTo(el) > 0) ? this.array[i] : el;
            }
        }
        return el;
    }
}
