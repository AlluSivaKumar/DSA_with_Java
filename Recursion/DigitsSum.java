package Recursion;

public class DigitsSum 
{
    public static void main(String[] args) 
    {
        System.out.println(SumDigits(567));
        System.out.println(prodDigits(726));
    }

    static int SumDigits(int num)
    {
        if(num == 0)
        {
            return 0;
        }
        return (num % 10) + SumDigits(num/10);
    }

    static int prodDigits(int num)
    {
        if(num%10 == num)
        {
            return num;
        }
        return (num % 10) * prodDigits(num/10);
    }
}
