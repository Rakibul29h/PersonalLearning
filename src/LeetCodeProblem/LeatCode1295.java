package LeetCodeProblem;

public class LeatCode1295 {
    static void main(String[] args) {
        int [] nums={12,324,23,2,6,7896};
        int count = findNumbers(nums);
        System.out.println(count);

    }

    public static int findNumbers(int[] nums){
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            int digit= digitCount(nums[i]);
            if(digit%2==0)
                count++;
        }
    return count;
    }

   /* public static int digitCount(int number){
        int count=0;
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }

    */

    //Optimized way to count digit

    public static int digitCount(int number){
        return (int) (Math.log10(number)+1);
    }
}
