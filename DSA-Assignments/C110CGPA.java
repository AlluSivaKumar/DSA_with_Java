
import java.util.Scanner;

public class C110CGPA 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of semesters :");
        int n = sc.nextInt();
        float total = 0;

        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter SGPA in sem " + i +" is :");
            float sgpa = sc.nextFloat();
            total = total + sgpa;
        }

        float cgpa = total/n;
        System.out.println("The CGPA is :" + cgpa);
    }
}
