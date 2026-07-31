package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode1260 {
    public static void main(String[] args) {
        int[][] grid = {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        System.out.println(shiftGrid(grid, 4));

    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) 
    {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            list.add(new ArrayList<>());
        }

        int[][] ans = rotation(grid);

        for (int i = 1; i < k; i++) 
        {
            ans = rotation(ans);
        }

        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.get(i).add(ans[i][j]);
            }
        }
        return list;
    }

    public static int[][] rotation(int[][] grid)
    {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                ans[i][j+1] =grid[i][j];
            }
        }

        for(int i=1;i<m;i++)
        {
            ans[i][0] = grid[i-1][n-1];
        }

        ans[0][0] = grid[m-1][n-1];

        return ans;

        /* for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        } */
    }

}
