package searchingAlgo;

public class OrderAgnosticBinarySearch {
    static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=7;
        int index= orderAgnosticBS(arr,target);
        System.out.println(index);
    }

    // return -1 if it does not exits

    static int orderAgnosticBS(int [] arr, int target){
        int start =0;
        int end =arr.length -1;

        boolean isAsc = arr[start]<arr[end];


        while(start<=end){
//            int mid = (int) (start+end)/2;
//            better way for this is
            int mid = start + (end-start)/2;

         if(target == arr[mid])
            {
                return mid;
            }

         if(isAsc){
            if(target<arr[mid])
            {
                end=mid-1;
            }else if(target>arr[mid])
            {
                start= mid+1;
            }
         }else{
             if(target<arr[mid])
             {
                 start=mid+1;
             }else if(target>arr[mid])
             {
                 end= mid-1;
             }
         }
        }

        return -1;
    }
}
