package T3_FunctionsAndMethods;

public class T7_PrimeOrNot {
    public static void main(String[] args) 
    {
        System.out.println(isPrime(5));   
    }
    static boolean isPrime(int num)
    {
        if( num <= 1)
        {
            return false;
        }

        int c = 2;

        while (c*c <= num) 
        {
            if(num % c ==0)
            {
                return false;
            }
            c++;
        }

        /* if(c*c > num)
        {
            return true;
        } */

        return true;
    }
}
