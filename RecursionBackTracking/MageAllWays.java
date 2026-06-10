package RecursionBackTracking;

import java.util.Arrays;

public class MageAllWays 
{
    public static void main(String[] args) 
    {
        boolean[][] mage = {{true,true,true},
                        {true,true,true},
                        {true,true,true}};

        allPaths("", mage, 0, 0);

        int[][] matrix = new int[mage.length][mage[0].length];
        allPathsrep("", mage, 0, 0, matrix, 1);

    }

    static void allPaths(String ans,boolean[][] mage,int row,int col)
    {
        if(row == mage.length-1 && col == mage[0].length-1)
        {
            System.out.println(ans);
            return;
        }

        if(mage[row][col] == false)
        {
            return;
        }

        //I'm considering the path where i go will be false
        mage[row][col] = false;

        if(row < mage.length-1)
        {
            allPaths(ans + "D", mage, row+1, col);
        }
        if(col < mage[0].length-1)
        {
            allPaths(ans + "R", mage, row, col+1);
        }
        if(row > 0)
        {
            allPaths(ans + "U", mage, row-1, col);
        }
        if(col > 0)
        {
            allPaths(ans + "L", mage, row, col-1);
        }

        mage[row][col] = true;
    }


    static void allPathsrep(String ans,boolean[][] mage,int row,int col,int[][] matrix,int step)
    {
        if(row == mage.length-1 && col == mage[0].length-1)
        {
            matrix[row][col] = step;
            for(int[] arr : matrix)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }

        if(mage[row][col] == false)
        {
            return;
        }

        //I'm considering
        mage[row][col] = false;
        matrix[row][col] = step;

        if(row < mage.length-1)
        {
            allPathsrep(ans + "D", mage, row+1, col, matrix, step+1);
        }
        if(col < mage[0].length-1)
        {
            allPathsrep(ans + "R", mage, row, col+1, matrix, step+1);
        }
        if(row > 0)
        {
            allPathsrep(ans + "U", mage, row-1, col, matrix, step+1);
        }
        if(col > 0)
        {
            allPathsrep(ans + "L", mage, row, col-1, matrix, step+1);
        }

        mage[row][col] = true;
        matrix[row][col] = 0;
    }
}
