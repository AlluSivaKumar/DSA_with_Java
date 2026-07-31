package TicTacToe;

import java.util.Scanner;

public class Game 
{
    public static void main(String[] args)
    {
        char[][] board = new char[3][3];
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        Scanner scanner = new Scanner(System.in);

        while(!gameOver)
        {
            printBoard(board);
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if(board[row][col] == ' ')
            {
                board[row][col] = player;
                if(playerWins(player,board))
                {
                    printBoard(board);
                    System.out.println("Player " + player + " Wins");
                    break;
                }
                if(player == 'X')
                {
                    player = 'O';
                }
                else
                {
                    player = 'X';
                }
            }
            else
            {
                System.out.println("Invalid Move!");
                break;
            }
        }
        scanner.close();
    }

    public static void printBoard(char[][] board)
    {
        for(int row=0;row<board.length;row++)
        {
            for(int col=0;col<board[row].length;col++)
            {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }

    public static boolean playerWins(char player,char[][] board)
    {
        //CHECKING EACH ROW
        for(int row=0;row<board.length;row++)
        {
            boolean result = true;
            for(int col=0;col<board[row].length;col++)
            {
                result = result && board[row][col] == player;
            }
            if(result == true)
            {
                return true;
            }
        }

        //CHECKING EACH DIAGONAL
        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
        {
            return true;
        }

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
        {
            return true;
        }

        return false;
    }
}
