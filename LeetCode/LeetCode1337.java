package LeetCode;

import java.util.*;

public class LeetCode1337 {
    public static void main(String[] args) 
    {
        int[][] mat =  {{1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}};
    
        System.out.println(Arrays.toString(kWeakestRows(mat, 3)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) 
    {
        int[] arr = new int[mat.length];

        for(int i=0;i<mat.length;i++)
        {
            int count = 0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
            }
            arr[i] = count;
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < k)
            {
                list.add(i);
            }
        }

        
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
