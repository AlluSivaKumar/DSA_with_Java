import java.util.Scanner;

public class C25ReturnMaxNumberUntilEnterZero 
{
    public static void main(String[] args) 
    {
                @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int max = 0;

        while(true)
        {
            int num = sc.nextInt();
            if(num == 0)
            {
                break;
            }
            else
            {
                if(num > max)
                {
                    max = num;
                }
            }
        }
        
        System.out.println("The Max of Numbers is :" + max);
    }
}
