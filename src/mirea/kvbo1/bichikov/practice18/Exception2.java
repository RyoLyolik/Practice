package mirea.kvbo1.bichikov.practice18;

import java.lang.*;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch(NumberFormatException e2){
            System.out.println("Нельзя привести переменную к целому числу\n");
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка\n");
        }
        finally {
            System.out.println("Конец\n");
        }
    }
}