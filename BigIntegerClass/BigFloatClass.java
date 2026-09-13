package BigIntegerClass;

import java.math.BigDecimal;

public class BigFloatClass 
{
    public static void main(String[] args) 
    {
        double a = 0.03;
        double b = 0.04;
        double ans = a - b; //-0.010000000000000002
        System.out.println(ans); 


        BigDecimal A = BigDecimal.valueOf(0.03);
        BigDecimal B = new BigDecimal("0.04");
        
        //ADDITION
        System.out.println(A.add(B));

        //SUBRACTION
        System.out.println(A.subtract(B));

        //MULTIPLICATION
        System.out.println(A.multiply(B));

        //DIVISION
        System.out.println(A.divide(B));

        //REMAINDER
        System.out.println(A.remainder(B));

        //POWER
        System.out.println(A.pow(2)); //pow(n) n must be a postive integer

        //NEGATE
        BigDecimal d = new BigDecimal("572782478.8378853");
        System.out.println(d.negate());

        //consANTAS
        BigDecimal z = BigDecimal.ONE;
        System.out.println(z);

        
    }
}
