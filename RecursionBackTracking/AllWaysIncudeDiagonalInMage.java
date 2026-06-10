package RecursionBackTracking;

public class AllWaysIncudeDiagonalInMage 
{
    public static void main(String[] args) 
    {
        AllWaysDiagonal("", 3, 3);
    }

    static void AllWaysDiagonal(String ans,int row,int col)
    {
        if(row == 1 && col == 1)
        {
            System.out.println(ans);
            return;
        }

        if(row > 1)
        {
            AllWaysDiagonal(ans+"D", row-1, col);
        }

        if(row > 1 && col > 1)
        {
            AllWaysDiagonal(ans+"A", row-1, col-1);
        }

        if(col > 1)
        {
            AllWaysDiagonal(ans+"R", row, col-1);
        }
    }
}
