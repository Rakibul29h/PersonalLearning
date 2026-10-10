package Sorting;

import java.util.Arrays;

public class Cyclincsort {
    static void main(String[] args) {
        int [] arr = {3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int [] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int currect = arr[i]-1;
            if(arr[i] !=arr[currect])
            {
                swap(arr,i, currect);
            }else{
                i++;
            }
        }
    }

    static void swap(int[ ] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
