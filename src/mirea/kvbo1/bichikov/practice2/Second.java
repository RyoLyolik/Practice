package mirea.kvbo1.bichikov.practice2;

import java.util.Scanner;

public class Second {
    public void first(){
        System.out.println("2.1.\tПо диаграмме класса UML описывающей сущность Автор. Необходимо написать программу, которая состоит из двух классов Author и TestAuthor. Класс Author должен содержать реализацию методов, представленных на диаграмме класса на рисунке 2.4.");
        TestAuthor t = new TestAuthor();
        t.test();
    }
    public void eighth(){
        System.out.println("2.8.\tНапишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке. Не используйте дополнительный массив для хранения результатов.");
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Введите количество элементов");

        while (!s.hasNextInt()){
            System.out.println("Ошибка ввода");
            s.next();
        }
        n = s.nextInt();
        String[] array = new String[n];

        System.out.println("Введите значения массива");
        String input = new String();
        for (int i = 0; i < n; i++){
            while (!s.hasNext()){
                System.out.println("Ошибка ввода");
                s.next();
            }
            input = s.next();
            array[i] = input;
        }
        System.out.println("Введенный массив: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        String temp;
        for (int i = 0; i < n/2; i++){
            temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println("Массив в обратном порядке");
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
