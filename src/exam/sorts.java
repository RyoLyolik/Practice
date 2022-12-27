package exam;

import java.util.ArrayList;

public class sorts {
    public sorts() {

    }

    public void bubble(int[] arr) {
        int i = arr.length;
        boolean sorted = false;
        while ((i > 1) && (!sorted)) {
            sorted = true;
            for (int j = 1; j < i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
            i--;
        }
    }

    public void insert(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int toInsert = a[i];
            int j = i - 1;
            while ((j >= 0) && (a[j] > toInsert)) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = toInsert;
        }
    }

    public void selection(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return list;
        }
        int middle = list.size() / 2;
        ArrayList<Integer> left = this.mergeSort((ArrayList<Integer>) list.subList(0, middle));
        ArrayList<Integer> right = this.mergeSort((ArrayList<Integer>) list.subList(middle, list.size()));
        return this.merge(left, right);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int aIndex = 0;
        int bIndex = 0;

        while (aIndex < A.size() && bIndex < B.size()) {
            if (A.get(aIndex) <= B.get(bIndex)) {
                result.add(A.get(aIndex));
                aIndex++;
            } else {
                result.add(B.get(bIndex));
                bIndex++;
            }
        }
        if (aIndex < A.size()) {
            result.addAll(A.subList(aIndex, A.size()));
        }
        if (bIndex < B.size()) {
            result.addAll(B.subList(bIndex, B.size()));
        }
        return result;
    }

    private static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    private static int partition(int[] arr, int l, int r){
        int point = arr[r];
        int i = l - 1;
        for(int j = l; j < r; j++){
            if(arr[j] < point){
                i++;
                swap(arr, j, i);}
        }
        i++;
        swap(arr, i, r);
        return i;
    }

    public static void quicksort(int[] arr, int l, int r){
        if(r - l > 1){
            int m = partition(arr, l, r);
            quicksort(arr, l, m - 1);
            quicksort(arr, m, r);
        }
    }

}
