package LeetCode;

import java.util.Scanner;

public class LeetCode374 
{
    public static void main(String[] args) {
        int n = 1;
        System.out.println(guessNumber(n));
    }
    public static int guessNumber(int n) 
    {
        int start = 1;
        int end = n;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(guess(mid) == 0)
            {
                return mid;
            }

            else if(guess(mid) == -1)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        return -1;
    }

    public static int guess(int n)
    {
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        sc.close();
        return result;
    }
}

