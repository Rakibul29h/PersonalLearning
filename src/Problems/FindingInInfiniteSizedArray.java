package Problems;

public class FindingInInfiniteSizedArray {

    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,8,10,11,12,13,14};
        int target=5;
        System.out.println(findTarget(arr,target));
    }

    //Sometimes it occurs out of bound because it is a limit array provided but in the actual array
    // there is infinite then the lenth bound never be out of bound;

    public static int findTarget(int[]arr, int target){

        int start = arr[0];
        int end = arr[1];
        while(target>arr[end]){
            int temp= end+1;
            end = end+ (end-start +1)*2;
            start = temp;

        }
        int ans = BS(arr,target,start,end);
        return ans;
    }

    public static int BS(int [] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
