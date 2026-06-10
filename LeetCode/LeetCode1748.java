package LeetCode;

public class LeetCode1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
    }

    public static int sumOfUnique(int[] nums) 
    {
       int sum = 0;
       for(int i=0;i<nums.length;i++)
       {
           int count = 0;
           for(int j=0;j<nums.length;j++)
           {
               if(nums[i] == nums[j])
               {
                   count++;
               }
           }

           if(count == 1)
           {
               sum = sum + nums[i];
           }
       }
       return sum;
    }
}
