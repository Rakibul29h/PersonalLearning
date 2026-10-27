package LeetCodeProblem;

public class LeetCode1342 {
    static void main(String[] args) {
        System.out.println(numberOfSteps(4));
    }
    static int numberOfSteps(int n)
    {
        return helper(n,0);
    }
    private static int helper (int n , int c)
    {

        if (n == 0)
            return c;

        c=c+1;
        if(n%2==0)
            return helper(n/2,c);
        else
            return helper(n-1,c);
    }

}
