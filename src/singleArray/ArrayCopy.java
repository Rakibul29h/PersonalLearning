package singleArray;

public class ArrayCopy {
    static void main(String[] args) {
        int[] sourceArray={2,3,1,5,10};
        int[] targetedArray=new int[sourceArray.length];

        System.arraycopy(sourceArray,0,targetedArray,0,sourceArray.length);

        for(int num:targetedArray){
            System.out.print(num +" ");
        }
        System.out.println(" ");
    }
}
