package mirea.kvbo1.bichikov.practiceLists2;

import java.lang.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задание 3
        // Сортировка двусвязного циклического списка с перестановкой соседних элементов
        int N = 10;
        MyLinkedList l = new MyLinkedList();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            l.insertEnd(rand.nextInt(N));
        }
        System.out.println("Исходный список");
        System.out.println(l);

        // Сортировка
        MyLinkedList sorted_list = merge_sort(l);
        System.out.println("Отсортированный список");
        System.out.println(sorted_list);
    }

    public static MyLinkedList merge_sort(MyLinkedList list){
        int n = list.size();
        if (n > 1){
            Node current = list.getHead().getNext();
            MyLinkedList left = new MyLinkedList();
            for (int i = 0; i < n/2; i++){
                left.insertEnd(current.getData());
                current = current.getNext();
            }
            MyLinkedList right = new MyLinkedList();
            for (int i = 0; i < (n+1)/2; i++){
                right.insertEnd(current.getData());
                current = current.getNext();
            }
            left = merge_sort(left);
            right = merge_sort(right);
            MyLinkedList result = merge(left, right);
            return result;
        }
        return list;
    }
    public static MyLinkedList merge(MyLinkedList list1, MyLinkedList list2){
        MyLinkedList res = new MyLinkedList();
        if (list1.size() == 0){
            return list2;
        }
        if (list2.size() == 0){
            return list1;
        }
        Node curr1 = list1.getHead().getNext();
        Node curr2 = list2.getHead().getNext();
        while (curr1 != list1.getHead() && curr2 != list2.getHead()){
            if (curr1.getData().compareTo(curr2.getData()) < 0){
                res.insertEnd(curr1.getData());
                curr1 = curr1.getNext();
            }
            else {
                res.insertEnd(curr2.getData());
                curr2 = curr2.getNext();
            }
        }
        while (curr1 != list1.getHead()){
            res.insertEnd(curr1.getData());
            curr1 = curr1.getNext();
        }
        while (curr2 != list2.getHead()){
            res.insertEnd(curr2.getData());
            curr2 = curr2.getNext();
        }
        return res;
    }
}