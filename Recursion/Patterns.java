package Recursion;

public class Patterns 
{
    public static void main(String[] args) 
    {
        triangle(4, 0);
        triangle2(4,0);
    }

    static void triangle2(int row ,int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row) //4,0
        {
            triangle2(row, col+1); //col == 4
            System.out.print("*");//this will execute when the function is removed from the stack
        }
        else
        {
            triangle2(row-1, 0);//here also column start from zero
            System.out.println();//this will also execute when the function is removed from the stack
        }
    }

    static void triangle(int row ,int col)
    {
        if(row == 0)
        {
            return;
        }
        if(col < row) //4,0
        {
            System.out.print("*");
            triangle(row, col+1); //col == 4
        }
        else
        {
            System.out.println();
            triangle(row-1, 0);//here also column start from zero
        }
    }
}
