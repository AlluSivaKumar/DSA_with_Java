package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1380 {
    public static void main(String[] args) 
    {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) 
    {
        List<Integer> list = new ArrayList<>();

        //
        
        
        for(int i=0;i<matrix.length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[j][i] > max)
                {
                    max = matrix[j][i];
                }
            }

            if(max == minInRow(matrix[i]))
            {
                list.add(max);
            }
        }
        return list;
    }


    public static int minInRow(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
