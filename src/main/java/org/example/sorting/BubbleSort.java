package org.example.sorting;

import java.util.Arrays;

/** Repeatedly swap two adjacent elements if they are in wrong(L>R) order. */
public class BubbleSort<T extends Comparable> {
    public static void main(String[] args) {
        BubbleSort<Integer> bubbleSortObj = new BubbleSort<>();
        Integer[] arr = new Integer[]{12, 45,23, 51, 19, 8};
        bubbleSortObj.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private void sort(T[] arr){
        int latestSortedIndex = arr.length - 1;
        while(latestSortedIndex > 0){
            for(int j = 0; j < latestSortedIndex; j++){
                if (arr[j].compareTo(arr[j + 1]) == 1) {
                    swap(arr, j, j+1);
                }
            }
            latestSortedIndex--;
        }
    }

    private void swap(T arr[], int i, int j) {
/*        int total = arr[i] + arr[j];
        arr[i] = total - arr[i];
        arr[j] = total - arr[i];*/
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
