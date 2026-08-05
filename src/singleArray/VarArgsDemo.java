package singleArray;

public class VarArgsDemo {
    static void main(String[] args) {
        printMax(1,2,3,4,5,6);
    }
    public static void printMax(double... numbers){
        if(numbers.length==0) {
            System.out.println("No argument passed");
            return;
        }

        double result= numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(result<numbers[i])
                result=numbers[i];
        }
        System.out.println("Maximum of this is "+ result);
    }
}
