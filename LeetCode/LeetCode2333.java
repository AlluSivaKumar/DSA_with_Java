package LeetCode;

public class LeetCode2333 {
    public static void main(String[] args) {
        
    }   
    
    public static  long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) 
    {
        //MODIFY NUMS1 AND NUMS2 MAKE SUM OF SQUARE DIFF IS MINIMUM
        if(k1 == 0 && k2 == 0)
        {
            return minSumSquareDifference(nums1, nums2);
        }

        

        return minSumSquareDifference(nums1, nums2);
    }

    public static long minSumSquareDifference(int[] nums1, int[] nums2)
    {
        int sum = 0;

        //NUMS1 AND NUMS2 LENGTH ARE SAME
        for(int i=0;i<nums1.length;i++)
        {
            sum = sum + square(nums1[i] - nums2[i]);
        }
        return sum;
    }

    public static long square(int num)
    {
        return num * num;
    }
}