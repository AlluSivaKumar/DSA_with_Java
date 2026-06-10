package RecursionBackTracking;

public class MageWithObstacle 
{
    public static void main(String[] args) 
    {
        boolean[][] mazeArr= {{true,true,true},{true,false,true},{true,true,true}};
        mageObstacle("",mazeArr,0, 0);
    }

    static void mageObstacle(String ans , boolean [][] maze, int row, int col)
    {
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(ans);
            return;
        }

        if(maze[row][col]==false) 
        {
            return;
        }
        if(row < maze.length-1)
        {
            mageObstacle(ans + "D", maze, row + 1, col);
        }
        if(col < maze[0].length-1)
        {
            mageObstacle(ans + "R", maze, row, col + 1);
        }
    }
}
