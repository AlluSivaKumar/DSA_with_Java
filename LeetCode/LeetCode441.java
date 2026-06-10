package LeetCode;

public class LeetCode441 
{
    public static void main(String[] args) 
    {
        int n = 2;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) 
    {
        while (n <= 0) 
        {
            return 0;
        }
        int start = 0;
        int end = n;
        int ans = 0;

        while (start < end) 
        {
            int mid = start + (end-start) / 2;

            long coins = sum(mid);

            if(coins == n)
            {
                return mid;
            }
            else if(coins > n)
            {
                end = mid - 1;
            }
            else
            {
                ans = mid;
                start = mid + 1;
            }
        }

        return ans;

    }

    public static long sum(int n)
    {
        return (n * (n+1)) / 2;
    }
}
