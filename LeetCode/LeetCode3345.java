package LeetCode;

public class LeetCode3345 {
    public static void main(String[] args) 
    {
        int n =  15;
        int t = 3;
        System.out.println(smallestNumber2(n, t));
    }

    public static int smallestNumber2(int n, int t) 
    {
        for(int i=n;i<=100;i++)
        {
            int prod = 1;

            int temp = i;
            while (temp > 0)
            {
                prod *= temp % 10;
                temp = temp / 10;
            }

            if(prod % t == 0)
            {
                return i;
            }
        }
        return n;
    }
        

    public static int smallestNumber(int n, int t) 
    {
        if(productOfDigits(n) % t == 0)
        {
            return n;
        }
        return smallestNumber(n + 1, t);
    }

    public static int productOfDigits(int n)
    {
        int prod = 1;

        while (n > 0)
        {
            prod *= n % 10;
            n = n / 10;
        }

        return prod;
    }
}
