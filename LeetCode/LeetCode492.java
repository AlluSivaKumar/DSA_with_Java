package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(constructRectangle(n)));
        sc.close();
    }

    public static int[] constructRectangle(int area) 
    {
        int r1 = (int)Math.ceil(Math.sqrt(area));

        while (area % r1 != 0)
        {
            r1--;
        }
        int l1 = area/r1;
        
        return new int[]{l1,r1};
    }


}
