package LeetCode;

public class LeetCode2180 {
    public static void main(String[] args) 
    {
        System.out.println(countEven(30));
    }

    public static int countEven(int num) 
    {
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(IsSumOfDigitsIsEven(i))
            {
                count++;
            }
        }
        return count;
    }

    public static boolean IsSumOfDigitsIsEven(int n)
    {
        int sum = 0;

        while (n > 0)
        {
            sum += n % 10;
            n = n/10;
        }

        return sum % 2 == 0;
    }
}
