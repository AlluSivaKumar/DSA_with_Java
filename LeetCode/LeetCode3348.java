package LeetCode;

class LeetCode3348
{
    public static void main(String[] args) 
    {
        String num = "12";
        long t = 1968750;
        System.out.println(smallestNumber(num, t));
    }

    public static String smallestNumber(String num, long t) 
    {
        int number = Integer.parseInt(num);

        //10pow5 means 100000
        long max = 2_000_000_000;

        if(number > max)
        {
            return "-1";
        }

        /* for(int i=number;i<=max;i++)
        {
            if(producrOfNumbers(i) % t == 0 && producrOfNumbers(i) == t)
            {
                String ans = Integer.toString(i);
                return ans;
            }
        } */

        for (long i = number; i <= max; i++)
        {
            if(String.valueOf(i).contains("0"))
            {
                continue;
            }
            /* if(producrOfNumbers(i) == t && producrOfNumbers(i) % t == 0)
            {
                return String.valueOf(i);
            } */
           /* long product = producrOfNumbers(i);
           if (product == t)
            {
                return String.valueOf(i);
           } */
          if (producrOfNumbers(i) % t == 0)
            {
               return String.valueOf(i);
            }
        }


        return "-1";
    }

    public static long producrOfNumbers(long n)
    {
        if (n == 0)
        {
            return 0;
        }

        long prod = 1;

        while (n > 0)
        {
            prod *= (n % 10);
            n /= 10;
        }

        return prod;

        /* long prod = 1;
        while (n > 0) 
        {
            prod *= n % 10;
            n = n / 10;
        }
        return prod; */
    }
}