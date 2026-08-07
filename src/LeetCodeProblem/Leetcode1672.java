package LeetCodeProblem;

public class Leetcode1672 {

    static void main(String[] args) {
        int[][] acounts = {
                {1,2,3},
                {3,2,1}
        };
        int maxWealth= maximumWealth(acounts);
        System.out.println(maxWealth);
    }

    public static int maximumWealth(int[][] accounts){
        int maxWealth=Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth= wealth(accounts[i]);
            if(currentWealth>maxWealth)
                maxWealth=currentWealth;

        }
        return maxWealth;
    }

    public static int wealth(int [] arr){
       int sum=0;
       for(int num:arr){
           sum+=num;
       }
       return sum;
    }
}
