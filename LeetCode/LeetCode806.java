package LeetCode;

import java.util.Arrays;

public class LeetCode806 
{
    public static void main(String[] args) 
    {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s =  "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }

    public static int[] numberOfLines(int[] widths, String s) 
    {
        int lines = 0;
        int currentWidth = 0;  

        for(char c : s.toCharArray())
        {
            int w = widths[c - 'a'];

            if(currentWidth + w <= 100)
            {
                currentWidth += w;
            }
            else
            {
                lines++;
                currentWidth = w;
            }
        }

        return new int[]{lines, currentWidth};
    }
}