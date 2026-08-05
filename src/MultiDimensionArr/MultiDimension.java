package MultiDimensionArr;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int [][] arr = new int[3][];

        int [][]a= new int[3][3];

//        This is input section for 2D array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        // Output of 2D array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

//        By using for loop
        for(int[] b:a) System.out.println(Arrays.toString(b));

        //another way

        for(int[] b:a){
            for(int c:b){
                System.out.print(c + "\t");

            }
            System.out.println();
        }
    }
}
