
import java.util.Scanner;

class D3EligibleToVote
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(voting(age))
        {
            System.out.println("You are Eligile to vote.");
        }
        else
        {
            System.out.println("You are not Eligile to vote.");
        }
    }

    static boolean voting(int age)
    {
        return age >= 18;
    }
}