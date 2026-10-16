package Recursion;

public class Simple {
    static void main(String[] args) {

    Number(5);
    }

    static void Number(int n)
    {


        if(n==1)
        {
            System.out.println(n);
            return;
        }
        Number(n-1);
        System.out.println(n);
    }

}
