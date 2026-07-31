package LeetCode;

import java.util.Arrays;

class LeetCode1051
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }

    public static int heightChecker(int[] heights) 
    {
        int[] visited = Arrays.copyOf(heights,heights.length);
        Arrays.sort(visited);

        int count = 0;

        for(int i=0;i<heights.length;i++)
        {
            if(heights[i] != visited[i])
            {
                count++;
            }
        }

        return count;
    }
}