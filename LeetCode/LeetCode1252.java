package LeetCode;

public class LeetCode1252 {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        //[0,1],[1,1]

        for(int i=0;i<indices.length;i++)
        {
            int row = indices[i][0];
            int col = indices[i][1];

            for(int j=0;j<n;j++)
            {
                ans[row][j]++;
            }

            for(int j=0;j<m;j++)
            {
                ans[j][col]++;
            }
        } 


        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ans[i][j] % 2 != 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
