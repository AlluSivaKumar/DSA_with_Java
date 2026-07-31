package LeetCode;
import java.util.*;

/**
 * LeetCode628
 */
public class LeetCode628 
{

    public static void main(String[] args) 
    {
        int[] nums = {-1,-2,-3,-4};
        System.out.println(maximumProduct(nums));
    }

    //THREE NUMBERS PRODUCTS MAXIMUM
    public static int maximumProduct(int[] nums) 
    {
        //BASE CONDITION
        if(nums.length < 3)
        {
            return 0;
        }

        //SORTING OF ARRAYS
        Arrays.sort(nums);

        int greater;
        int left = nums[0] * nums[1];
        int right = nums[nums.length-1] * nums[nums.length-2];

        if(left > right)
        {
            greater = left * nums[nums.length-1];
        }
        else
        {
            greater = right * nums[nums.length-3];
        }

        if(left * nums[nums.length-1] > greater)
        {
            return left*nums[nums.length-1];
        }

        /* if(right * nums[nums.length-1] < greater)
        {
            if(right*nums[nums.length-1] > greater)
            {
                return right*nums[nums.length-1];
            }
        } */

        if(right * nums[nums.length-3] > greater)
        {
            return right * nums[nums.length-3];
        }
        
        return greater;
    }
}