package LeetCode;

/**
 * LeetCode3622
 */
public class LeetCode3622 
{
    public static void main(String[] args) 
    {
        int n = 99;
        System.out.println(checkDivisibility(n));
    }

    public static boolean checkDivisibility(int n) 
    {
        int sum = 0;
        int prod = 1;

        int temp = n;
        while (temp > 0)
        {
            int digit = temp % 10;
            sum += digit;
            prod *= digit;
            temp = temp / 10;
        }

        int total = sum + prod;

        return n == total;
    }
}