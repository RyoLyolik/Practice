package mirea.kvbo1.bichikov.practice3;
import java.util.Arrays;
import java.util.Random;
public class Third {
    public void shellsFirst(){
        System.out.println("Создайте объекты класса Double, используя методы valueOf().");
        Double d = Double.valueOf("101101.10111");
        System.out.println(d);
    }
    public void randomFirst(){
        System.out.println("Создать массив вещественных чисел случайным образом, вывести его\n" +
                "на экран, отсортировать его, и снова вывести на экран (использовать два\n" +
                "подхода к генерации случайных чисел – метод random() класса Math и класс\n" +
                "Random)\n");
        int n = 10;
        Random rand = new Random();

        int[] arr1 = new int[n];
        double[] arr2 = new double[n];
        System.out.println("Первый массив");
        for (int i = 0; i < n; i++){
            arr1[i] = rand.nextInt(n);
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Второй массив");
        for (int i = 0; i < n; i++){
            arr2[i] = Math.random();
            System.out.print(arr2[i] + " ");
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println();
        System.out.println();
        System.out.println("Первый отсортированный массив");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Второй отсортированный масссив");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
