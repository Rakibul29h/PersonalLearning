package Patterns;

public class Pattern {
    static void main(String[] args) {
        pattern4(4   );
    }

    static void pattern1(int n)
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n)
    {
        for(int row =1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n)
    {
        for(int row=n;row>0;row--)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n)
    {
        for(int row = 1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(col);
            }
            System.out.println(" ");
        }
    }


}
