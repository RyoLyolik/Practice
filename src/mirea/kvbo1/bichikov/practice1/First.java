package mirea.kvbo1.bichikov.practice1;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class First {
    public void third(){
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("1.3\tНаписать программу, в результате которой массив чисел создается с помощью инициализации (как в Си) вводится и считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его элементов результат выводится на экран. Использовать цикл for.");
        System.out.println("Введите количество элементов");

        while (!s.hasNextInt()){
            System.out.println("Ошибка ввода");
            s.next();
        }
        n = s.nextInt();
        int[] array = new int[n];

        int input;
        int sum = 0;
        float average;

        System.out.println("Введите значения массива");
        for (int i = 0; i < n; i++){
            while (!s.hasNextInt()){
                System.out.println("Ошибка ввода");
                s.next();
            }
            input = s.nextInt();
            array[i] = input;
            sum += input;
        }
        average = sum/n;
        System.out.println("Сумма " + sum);
        System.out.println("Среднее " + average);
    }
    public void sixth(){
        System.out.println("1.6\tНаписать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматировать вывод).");
        int denominator = 1;
        System.out.print("1"+"; ");
        denominator++;
        while (denominator <= 10) {
            System.out.print("1/" + denominator + "; ");
            denominator++;
        }
    }
    public void seventh(){
        System.out.println("1.7\tНаписать программу, которая с помощью метода класса, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить работу метода.");
        Scanner s = new Scanner(System.in);
        int n;
        int result;
        int cnt = 0;
        System.out.println("Введите число");
        while (!s.hasNextInt()){
            System.out.println("Ошибка ввода");
            s.next();
        }
        n = s.nextInt();
        result = 1;
        cnt = 1;
        while (cnt <= n){
            result *= cnt;
            cnt++;
        }
        System.out.println(n+"! = " + result);
    }
}
