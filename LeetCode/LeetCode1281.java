package LeetCode;

public class LeetCode1281 {
    public static void main(String[] args) {
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) 
    {
        int prod = 1;
        int sum = 0;
        int temp = n;
        while (temp > 0) 
        {
            int rem = temp % 10;
            prod *= rem;
            sum += rem;
            temp = temp / 10;
        }

        return prod-sum;

    }
}
