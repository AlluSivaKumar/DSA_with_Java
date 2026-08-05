package LeetCode;

public class LeetCode204 
{
    public static void main(String[] args) 
    {
        int n = 10;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) 
    {
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }
        
        if(n == 2)
        {
            return true;
        }

        if(n > 2 && n % 2 == 0)
        {
            return false;
        }

        int c = 3;
        while(c*c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c += 2;
        }

        return true;
    }
}
