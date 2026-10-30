package Recursion;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5,3,4,8,1};
        sort(arr, 0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int s, int e, int max) {
        if (e <= 0) {
            return;
        }

        if (s < e) {
            if (arr[s] > arr[max]) {
                sort(arr, s + 1, e, s);
            } else {
                sort(arr, s + 1, e, max);
            }
        } else {
            int temp = arr[e];
            arr[e] = arr[max];
            arr[max] = temp;

            sort(arr, 0, e - 1, 0);
        }
    }
}
