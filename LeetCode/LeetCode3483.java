package LeetCode;

import java.util.Arrays;

public class LeetCode3483 {
    public static void main(String[] args) {
        totalNumbers(new int[] {1,2,3,4,5});
    }

    public static void totalNumbers(int[] digits) 
    {
        int[] freq = new int[10];

        for(int i=0;i<10;i++)
        {
            freq[i]++;
        }

        //CHOOSE FROM CONSTRAINS - NUMBER SHOULD BE THREE DIGIT NUMBER

        System.out.println(Arrays.toString(freq));
    }
}
