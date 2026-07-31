package LeetCode;

public class LeetCode3658 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }

    public static int gcdOfOddEvenSums(int n) 
    {
        int evenSum = 0;
        int oddSum = 0;

        int i = 1;
        while(i <= n)
        {
            evenSum += 2*i;
            oddSum += 2*i-1;
            i++;
        }

        System.out.println(evenSum);
        System.out.println(oddSum);

        return 0;
    }
}
