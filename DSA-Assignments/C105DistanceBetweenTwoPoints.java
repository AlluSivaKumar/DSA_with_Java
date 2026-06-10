import java.util.Scanner;

public class C105DistanceBetweenTwoPoints 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter where the point starts from :");
        int StartPoint = sc.nextInt();

        System.out.print("Enter where the point Ends :");
        int EndPoint = sc.nextInt();
        int distance;

        if(EndPoint < StartPoint)
        {
            distance = StartPoint-EndPoint;
        }
        else
        {
            distance = EndPoint-StartPoint;
        }

        System.out.println("The distance between two points is : "+distance);

    }
}
