package LeetCode;

class LeetCode3513
{
    public static void main(String[] args) 
    {
        int[] nums = {1,3,2};
        System.out.println(uniqueXorTriplets(nums));
    }

    public static int uniqueXorTriplets(int[] nums) 
    {
        int max = nums.length;

        int bits =  32 - Integer.numberOfLeadingZeros(max);

        return (int)Math.pow(2, bits);




        /* HashSet<Integer> list = new HashSet<>();;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                for(int k=0;k<nums.length;k++)
                {
                    int ans = nums[i]^nums[j]^nums[k];
                    list.add(ans);
                }
            }
        }

        return list.size(); */
    }
}