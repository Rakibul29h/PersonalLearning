package searchingAlgo;

import java.util.Arrays;

public class LinearSearchIn2D {
    static void main(String[] args) {

        int [][] arr = {
                {23, 13, 56},
                {34, 65, 98},
                {1,2,3}
        };

        int target=-13;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        if(arr.length==0)
            return new int[]{-1,-1};

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target)
                    return new int[]{row,col};
            }
        }

        return new int[]{-1,-1};
    }
}
