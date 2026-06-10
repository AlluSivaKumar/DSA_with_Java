package Questions;

import java.util.Scanner;

public class HappyNumber 
{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //LLHasCycle obj = new LLHasCycle();
        System.out.println(isHappyNumber(num));
        //System.out.println(sumOfSquareOfDigits(89));
    }

    static boolean isHappyNumber(int num) 
    {
        int slow = num;
        int fast = num;

        do{
            slow = sumOfSquareOfDigits(slow);
            fast = sumOfSquareOfDigits(sumOfSquareOfDigits(fast));
        }while (slow != fast);

        if(slow == 1)
        {
            return true;
        }
        return false;
    }

    public static int sumOfSquareOfDigits(int num) 
    {
        int sum = 0;
        while (num > 0) 
        {
            int rem = num % 10;
            sum = sum + rem * rem;
            num = num/10;
        }
        return sum;
    }
}
