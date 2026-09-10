package LeetCode;

public class LeetCode3871 
{
    public static long countCommas(long n) 
    {
        if(n > 999 && n < 1_000_000)
        {
            return n - 999;
        }
        else if(n > 999_999 && n < 1_000_000_000)
        {
            long n1 = n - 999_999;
            long n2 = 999_999 - 999;

            return n1*2 + n2;
        }
        else if(n > 999_999_999 && n < 1_000_000_000_000L)
        {
            long n1 = n - 999_999_999;
            long n2 = 999_999_999 - 999_999;
            long n3 = 999_999 - 999;

            return  n1*3 + n2*2 + n3;
        }
        else if(n > 999_999_999_999L && n < 1_000_000_000_000_000L)
        {
            long n1 = n - 999_999_999_999L;
            long n2 = 999_999_999_999L - 999_999_999;
            long n3 = 999_999_999 - 999_999;
            long n4 = 999_999 - 999;

            return n1*4 + n2*3 + n3*2 + n4;
        }
        else if(n > 999_999_999_999_999L && n < 1_000_000_000_000_000_000L)
        {
            long n1 = n - 999_999_999_999_999L;
            long n2 = 999_999_999_999_999L - 999_999_999_999L;
            long n3 = 999_999_999_999L - 999_999_999;
            long n4 = 999_999_999 - 999_999;
            long n5 = 999_999 - 999;

            return n1*5 + n2*4 + n3*3 + n4*2 + n5;
        }
        return 0;
        
    }

    public static void main(String[] args) 
    {
        long n = 1122872257463L;
        System.out.println(countCommas(n));
    }
}
