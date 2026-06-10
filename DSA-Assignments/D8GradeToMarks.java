import java.util.Scanner;

public class D8GradeToMarks 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        System.out.println("You get : " + Grade(marks));
    }

    static String Grade(int marks)
    {
        if(marks > 90)
        {
            return "AA";
        }
        else if(marks > 80 && marks <= 90)
        {
            return "AB";
        }
        else if(marks > 70 && marks <= 80)
        {
            return "BB";
        }
        else if(marks > 60 && marks <= 70)
        {
            return "BC";
        }
        else if(marks > 50 && marks <= 60)
        {
            return "CD";
        }
        else if(marks > 40 && marks <= 50)
        {
            return "DD";
        }
        else 
        {
            return "Fail";
        }
    }
}
