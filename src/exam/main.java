package exam;

import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
    }

    public int josephus() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;
        Queue<Integer> Q = new Queue;
        for (int i = 0; i < a.length; i++) Q.enqueue(a[i]);

        if (Q.isEmpty()) return -1;
        while (Q.size() > 1) {
            System.out.println(" Queue: " + Q + " k = " + k);
            for (int i = 0; i < k; i++) Q.enqueue(Q.dequeue());
            E e = Q.dequeue();
            System.out.println(" " + e + " is out");
        }
        return Q.dequeue(); //победитель!

    }
}
