package Problems;

public class FloorNumberOFATargetInArray {
    static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target=10;

        System.out.println(floorNumber(arr,target));
    }
    static int floorNumber(int [] arr, int target){
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

        return end;
    }
}
