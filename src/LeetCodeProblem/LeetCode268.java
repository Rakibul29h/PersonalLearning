package LeetCodeProblem;

public class LeetCode268 {
    static void main(String[] args) {
        int arr[] = {0,1,2,4};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr)
    {
        int i =0;
        while(i<arr.length)
        {
            int correctPos= arr[i];
            if(arr[i] < arr.length && arr[correctPos]!=arr[i])
            {
                swap(arr,correctPos,i);
            }else{
                i++;
            }
        }

        for(int index = 0 ;index<arr.length;index++)
        {
            if(arr[index] != index)
                return index;
        }

        return arr.length;
    }

    public static void swap(int[]arr, int first, int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
