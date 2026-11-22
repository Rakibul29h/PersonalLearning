package Array_Method;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] numbers = new int[5]; // default value is 0
        Arrays.fill(numbers,5); // All element become 5
        int [] number2 = Arrays.copyOf(numbers,5);
        System.out.println("Numbers full array is "+ Arrays.toString(numbers));
        System.out.println("Number 2 full array is "+ Arrays.toString(number2));
        number2[3]=2;
        System.out.println(Arrays.equals(numbers,number2));

        int [] newArr = {1,3,4,2,8,5};
        Arrays.sort(newArr);
        System.out.println(Arrays.toString(newArr));
        int [] newArr2= newArr  ;
        newArr2[2] = 10;
        System.out.println("After change the value of newArray is "+ Arrays.toString(newArr));
        System.out.println("After change the value of newArray2 is "+ Arrays.toString(newArr2));
        // both are same that mean the copy is only reference
//         For that we can use
        int [] newArr3= newArr.clone();
        newArr3[4]=200;
        System.out.println("After change the value of newArray3 is : "+Arrays.toString(newArr3));
        System.out.println("After change the value of newArray is : "+Arrays.toString(newArr));
    }
}
