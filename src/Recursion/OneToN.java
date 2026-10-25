package Recursion;

public class OneToN {
    static void main(String[] args) {
        printing(5);
    }
    static void printing(int n)
    {
        if(n==0){
            return;
        }
        printing(n-1);
        System.out.println(n);
    }


}
