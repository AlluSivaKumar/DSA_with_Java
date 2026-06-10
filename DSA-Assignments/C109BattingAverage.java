
import java.util.Scanner;

public class C109BattingAverage 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Matches played :");
        int matches = sc.nextInt();
        int total = 0;

        for(int i=1;i<=matches;i++)
        {
            System.out.print("Enter rus in match " + i +" is :");
            int score = sc.nextInt();
            total = total + score;
        }

        int average = total/matches;
        System.out.println("Batting Average is : "+average);
    }
}
