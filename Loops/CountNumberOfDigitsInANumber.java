package Loops;

public class CountNumberOfDigitsInANumber {
    public static void main(String[] args) {
        int n = 2344664;

        int digit =  4;
        
        int count = 0;

        while (n > 0)
        {
            if(n % 10 ==  digit)
            {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);
    }
}
