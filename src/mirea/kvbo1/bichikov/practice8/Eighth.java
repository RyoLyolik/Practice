package mirea.kvbo1.bichikov.practice8;
import java.util.Scanner;

public class Eighth {
    public void second(){
        System.out.println("Дано натуральное число n. Выведите все числа от 1 до n.");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        if (sc.hasNextInt()){
            n = sc.nextInt();
        }
        numbers_till_n(1, n);
        System.out.println();
    }
    public void numbers_till_n(int current, int n){
        if (current <= n){
            System.out.print(current + " ");
            numbers_till_n(current+1, n);
        }
        return;
    }

    public void seventh(){
        System.out.println("7.\tЗадание Разложение на множители\n" +
                "Дано натуральное число n>1. Выведите все простые множители этого числа в порядке не убывания с учетом кратности. Алгоритм должен иметь сложность O(logn)");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        if (sc.hasNextInt()){
            n = sc.nextInt();
        }
        if (n > 0) {
            factorization(2, n);
        }
        System.out.println();
    }
    public void factorization(int divider, int n){
        if (n==1){
            return;
        }
        if (n%divider == 0){
            System.out.print(divider + " ");
            factorization(divider, n/divider);
        }
        else{
            factorization(divider+1, n);
        }
    }
    public void eighth(){
        System.out.println("Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом. Выведите YES или NO.");
        Scanner sc = new Scanner(System.in);
        String w = "";
        if (sc.hasNext()){
            w = sc.next();
        }
        System.out.println(palindrome(w, 0));
        System.out.println();
    }
    public boolean palindrome(String word, int index){
        if (index*2 >= word.length()){
            return true;
        }
        if (word.charAt(index) == word.charAt(word.length()-index-1)){
            return palindrome(word, index+1);
        }
        else{
            return false;
        }
    }
}
