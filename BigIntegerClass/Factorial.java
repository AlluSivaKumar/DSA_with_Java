package BigIntegerClass;

import java.math.BigInteger;

public class Factorial 
{
    public static BigInteger facctorial(int num)
    {
        BigInteger ans = new BigInteger("1");
        for(int i=1;i<num;i++)
        {
            BigInteger n = BigInteger.valueOf(i);
            ans = ans.multiply(n);
        }
        return ans;
    }
    public static void main(String[] args) 
    {
        System.out.println(facctorial(123));
    }
}
