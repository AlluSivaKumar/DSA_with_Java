package LeetCode;

public class LeetCode1665 {
    public static void main(String[] args) {
        int[][] tasks = {{1,2},{2,4},{4,8}};
        System.out.println(minimumEffort(tasks));
    }

    public static int minimumEffort(int[][] tasks) 
    {
        int rows = tasks.length;
        int cols = tasks[0].length;

        int minEffort = 0;

        for(int row = rows-1; row >= 0; row--)
        {
            minEffort = tasks[row][cols-1] - tasks[row][cols-2];
        }

        return minEffort+1;
    }
}
