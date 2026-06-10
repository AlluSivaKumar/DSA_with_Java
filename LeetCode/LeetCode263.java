package LeetCode;

public class LeetCode263 {
    public static void main(String[] args) {
        System.out.println(isUgly(24));
    }
    public static boolean isUgly(int n) 
    {
        int temp = n;

        while (temp % 2 == 0)
        {
            temp = temp/2;
        }

        while (temp % 3 == 0) 
        {
            temp = temp/3;
        }

        while (temp % 5 == 0)
        {
            temp = temp/5;
        }

        return temp == 1;
    }
}
