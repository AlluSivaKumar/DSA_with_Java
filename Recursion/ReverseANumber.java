package Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
        int num = 12345;
        rev1(num);
        System.out.println(sum);
        //System.out.println(rev2(num));
    }

    static int sum = 0;
    static void rev1(int num)
    {
        if(num == 0)
        {
            return;
        }
        int rem = num%10;
        sum = sum * 10 + rem;
        rev1(num/10);
    }

    static int rev2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    static int helper(int n,int digits)
    {
        if(n%10 == n) {
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10, digits) + helper(n/10, digits-1);
    }

}
