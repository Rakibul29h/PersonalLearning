package Recursion;

public class Array {
    static void main(String[] args) {
        int[] arr = {1,3,5, 4};
        System.out.println(find(arr, 0,4));
    }
    static boolean isSorted( int[] arr ,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&isSorted(arr,index+1);
    }

    static boolean isExist(int[] arr, int index, int target)
    {
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || isExist(arr,index+1,target);
    }

    static int find(int[] arr,int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return find(arr,index+1,target);
        }
    }

}
