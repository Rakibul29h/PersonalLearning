package Patterns;

public class Pattern {
    static void main(String[] args) {
        pattern28(5  );
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


    static void pattern5(int n)
    {
       for(int row = 1; row<2*n;row++)
       {
           int totalColsInRow = row>n?2*n-row:row;
           for(int col =0;col<totalColsInRow;col++)
           {
               System.out.print("*");
           }
           System.out.println(" ");
       }
    }

    static  void pattern28(int n)
    {
        for(int row=1;row<2*n;row++)
        {
            int totalColInRow = row>n?2*n - row:row;
            int space = n-totalColInRow;
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }
            for(int col = 0 ; col<totalColInRow;col++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }


}
