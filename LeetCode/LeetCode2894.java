package LeetCode;

public class LeetCode2894 {
    public static void main(String[] args) 
    {
        int n = 10, m = 3;
        System.out.println(differenceOfSums(n, m));
    }

    public static int differenceOfSums(int n, int m) 
    {
        int divSum = 0;
        int nonDivSum  = 0;

        for(int i=1;i<=n;i++)
        {
            if(i % m == 0)
            {
                divSum += i;
            }
            else
            {
                nonDivSum += i;
            }
        }

        return nonDivSum - divSum;
    }
}
