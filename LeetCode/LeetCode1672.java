package LeetCode;
public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++)
        {
            int currentSum = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                currentSum += accounts[i][j];
            }
            if(currentSum > max)
            {
                max = currentSum;
            }
        }
        return max;
    }
}
