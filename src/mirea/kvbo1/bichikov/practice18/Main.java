package mirea.kvbo1.bichikov.practice18;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        Exception1 task1 = new Exception1();
        task1.exceptionDemo();
        // Задание 2,3,4
        System.out.println("Задание 2,3,4");
        Exception2 task2 = new Exception2();
        task2.exceptionDemo();
        //Задание 5
        System.out.println("Задание 5");
        ThrowsDemo task5 = new ThrowsDemo();
        task5.printMessage(null);
        //Задание 6
        System.out.println();
        System.out.println("Задание 5");
        task5.printMessage("123");
        task5.printMessage(null);
        //Задание 7,8
        System.out.println("\nЗадание 7,8");
        ThrowsDemo2 task7 = new ThrowsDemo2();
        task7.getKey();

    }
}