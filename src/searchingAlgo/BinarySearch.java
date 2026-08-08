package searchingAlgo;

public class BinarySearch {

    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=9;
        int index= binarySearch(arr,target);
        System.out.println(index);
    }

    // return -1 if it does not exits
     static int binarySearch(int [] arr, int target){
         int start =0;
         int end =arr.length -1;
        while(start<=end){
//            int mid = (int) (start+end)/2;
//            better way for this is
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid])
            {
                start= mid+1;
            }else if(target == arr[mid])
            {
                return mid;
            }
        }

        return -1;
     }
}
