package mirea.kvbo1.bichikov.practice22;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // push, pop, isempty, isfull, peek, count, change, display
        Stack<Double> numbers = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String stop = "";
        while (!stop.equals("!")) {
            if (sc.hasNextDouble()) {
                double n = sc.nextInt();
                numbers.push(n);
            } else {
                String s = sc.next();
                stop = s;
                if (numbers.size()>=2) {
                    double x, y;
                    x = numbers.pop();
                    y = numbers.pop();
                    switch (s) {
                        case "+":
                            numbers.push(y + x);
                            break;
                        case "-":
                            numbers.push(y - x);
                            break;
                        case "*":
                            numbers.push(y * x);
                            break;
                        case "/":
                            numbers.push(y/x);
                            break;
                        default:
                            numbers.push(x);
                            numbers.push(y);
                            if (!s.equals("!"))
                            {
                                System.out.println("Неверный знак ->" + s);
                            }
                            break;
                    }

                }
            }
        }
        if (numbers.size() > 1) {
            System.out.println("Не над всеми числами проведены операции");
        }
        else{
            System.out.println("Ответ: " + numbers.pop());
        }

    }
}