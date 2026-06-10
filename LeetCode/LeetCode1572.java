package LeetCode;

public class LeetCode1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] mat) 
    {
        int sum = 0;
        int n = mat.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i == j)
                {
                    sum = sum + mat[i][j];
                }

                if(i+j == n-1)
                {
                    sum += mat[i][j];
                }
            }
        }

        if(n %2 != 0)
        {
            sum = sum - mat[n / 2][n / 2];
        }

        return sum;        
    }
}
