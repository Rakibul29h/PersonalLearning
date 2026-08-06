package searchingAlgo;

public class LinearSearch {
    static void main(String[] args) {
        int[] nums = {23,24,25,-11,234,23,45,65,-1,2,0};
        int target=-1;
        int index=linearSearch(nums,target);
        System.out.println("Target = "+ target + " Found at index: "+index);
    }
    //return the index if item found or -1 for now found
    static int linearSearch(int[] arr,int key){
        if(arr.length==0){
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)
                return i;

        }
        return -1;
    }
}
