package BigIntegerClass;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 30;
        System.out.println("a : " + a + " , "+ " b : " + b);

        //In the valueOf fuction you just must take in the range of integer
        BigInteger A = BigInteger.valueOf(34);
        BigInteger B = BigInteger.valueOf(89);

        //Take input in form of string but it automatically gives in form of number
        //Here you take take as much as large input
        BigInteger C = new BigInteger("456246723764");
        System.out.println(C);

        //CONSTANTS
        BigInteger D = BigInteger.ONE;
        System.out.println(D);

        //SUM
        BigInteger sum = A.add(B); // We cannot use arthematic operators;
        System.out.println(sum);

        //Convert BigInteger to int value;
        int x = A.intValue();
        System.out.println(x);
    }
}
