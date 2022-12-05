package mirea.kvbo1.bichikov.practice19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Клиент совершает покупку онлайн. При оформлении заказа у
                пользователя запрашивается фио и номер ИНН. В программе проверяется,
                действителен ли номер ИНН для такого клиента. Исключение будет выдано
                в том случае, если введен недействительный ИНН.
                """);
        int size = 5;
        int[] INNs = new int[size];
        for (int i = 0; i < size; i++){
            INNs[i] = i;
        }
        int inp = -1;
        System.out.println("Введите ИНН");
        Scanner sc=new Scanner(System.in);
        if (sc.hasNextInt()){
            inp = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < size; i++){
            if (inp==INNs[i]){
                found=true;
                break;
            }
        }
        if (!found){
            try {
                throw new MyException("Invalid INN");
            } catch (MyException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
