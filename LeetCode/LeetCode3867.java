package LeetCode;

import java.util.Arrays;

public class LeetCode3867 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,6,4};
        System.out.println(gcdSum(arr));
        //System.out.println(gcd(0, 6));
    }

    public static long gcdSum(int[] nums) 
    {
        int max = nums[0];
        int[] maxToThatElement = new int[nums.length];

        maxToThatElement[0] = max;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
            maxToThatElement[i] = max;
        }

        /* System.out.println("Maximum Elemnt to that number :");
        System.out.println(Arrays.toString(maxToThatElement)); */

        int[] gcds = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            gcds[i] = gcd(nums[i], maxToThatElement[i]);
        }

        /* System.out.println("GCDS to max to that place element :");
        System.out.println(Arrays.toString(gcds)); */


        Arrays.sort(gcds);

        /* System.out.println("After sorting : ");
        System.out.println(Arrays.toString(gcds));
 */
        long sum = 0;
        int start = 0;
        int end = gcds.length-1;

        while (start < end)
        {
            sum += gcd(gcds[start], gcds[end]);
            start++;
            end--;
        }
        return sum;
    }

    /* public static int gcd(int a, int b)
    {
        if(a > b)
        {
            //SWAP
            int temp = a;
            a = b;
            b = temp;
        }

        if(a == 0 || b == 0)
        {
            return 0;
        }

        if(b % a == 0)
        {
            return a;
        }

        int hcf = a;
        while (hcf >= 0)
        {
            if(b % hcf == 0 && a % hcf == 0)
            {
                return hcf;
            }
            hcf--;
        }

        return hcf;
    } */

    public static int gcd(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
