package LeetCode;

class LeetCode3876
{
    public static void main(String[] args)
    {
        int[] arr = {2,3};
        System.out.println(uniformArray(arr));
    }

    public static boolean uniformArray(int[] nums1) 
    {
        if(ifAllEven(nums1) || ifAllOdd(nums1))
        {
            return true;
        }
        
        int min = nums1[0];

        for(int num : nums1)
        {
            if(num < min)
            {
                min = num;
            }
        }

        if(min % 2 == 0)
        {
            return false;
        }
        return true;
    }

    public static boolean ifAllEven(int[] nums)
    {
        for(int num : nums)
        {
            if(num % 2 != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean ifAllOdd(int[] nums)
    {
        for(int num : nums)
        {
            if(num % 2 == 0)
            {
                return false;
            }
        }
        return true;
    }
}