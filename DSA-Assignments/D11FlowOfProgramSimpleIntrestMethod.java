import java.util.Scanner;

public class D11FlowOfProgramSimpleIntrestMethod 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the priniciple amount: ");
        float p = sc.nextFloat();

        System.out.print("Enter the years :");
        float t = sc.nextFloat();

        System.out.print("Enter rate of intrest : ");
        float r = sc.nextFloat();

        float ans = simpleIntrest(p,t,r);
        System.out.println(ans);
    }

    static float simpleIntrest(float  principle, float time,float rateOfIntrest)
    {
        return (float)(principle*time*rateOfIntrest)/100;
    }
}
