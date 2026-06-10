package RecursionBackTracking;

public class CountWaysInMaze 
{
    public static void main(String[] args) 
    {
        System.out.println(count(4, 4));
    }

    static int count(int row,int col)
    {
        if(row == 1 || col == 1)
        {
            return 1;
        }

        int below = count(row-1, col);
        int right = count(row, col-1);

        return  below + right ;
    }    
}