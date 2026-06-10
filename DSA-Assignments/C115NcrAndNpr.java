
import java.util.Scanner;

public class C115NcrAndNpr 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        int nfact = 1;
        int NminusRfact = 1;
        int rFact = 1;
        for(int i=n; i>=1; i--)
        {
            nfact = nfact*i;
        }
        for(int i=n-r; i>=1; i--)
        {
            NminusRfact = NminusRfact*i;
        }
        for(int i=r; i>=1; i--)
        {
            rFact = rFact*i;
        }

        int nPr = nfact/rFact;
        int nCr = nfact/(rFact*NminusRfact);
        System.out.println("nPr of n:"+n+" and r:"+r+" is : "+nPr);
        System.out.println("nCr of n:"+n+" and r:"+r+" is : "+nCr);
    }
}
