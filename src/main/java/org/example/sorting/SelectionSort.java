package org.example.sorting;

import java.util.Arrays;

/** Find the minimum element in the unsorted array and swap it with the element in the beginning.*/
public class SelectionSort<T extends Comparable> {
    public static void main(String[] args) {
        SelectionSort<Integer> selectionObj = new SelectionSort<>();
        Integer[] arr = new Integer[]{12, 45,23, 51, 19, 8};
        selectionObj.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private void sort(T[] arr){
        for(int i = 0; i < arr.length -1 ; i++){
            for(int j = i + 1; j < arr.length; j++){
                //For Decendng order use ">"
                //For Ascendng order use "<"
                if(arr[j].compareTo(arr[i]) == -1){
                    swap(arr, i, j);
                }
            }
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
