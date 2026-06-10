package LeetCode;

import java.util.Arrays;

public class LeetCode832 {
    public static void main(String[] args) 
    {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));
    }

    public static int[][] flipAndInvertImage(int[][] image) 
    {
        //int[][] ans = new int[image.length][image.length];

        for(int i=0;i<image.length;i++)
        {
            int start = 0;
            int end = image.length-1;

            while (start <= end) 
            {
                int temp = image[i][start] ^ 1;
                image[i][start] = image[i][end] ^ 1;
                image[i][end] = temp;
                start++;
                end--;
            }
        }

        /* for(int i=0;i<image.length;i++)
        {
            for(int j=0;j<image.length;j++)
            {
                if(image[i][j] == 0)
                {
                    image[i][j] = 1;
                }
                else
                {
                    image[i][j] = 0;
                }
            }
        } */

        return image;
    }
}
