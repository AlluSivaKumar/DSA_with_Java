import java.util.Scanner;

public class B6INRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupess :");
        float rup = sc.nextFloat();

        float usd = (rup / 80);
        System.out.printf("%.2f Rs is  %.2f in USD",rup,usd);
        sc.close();
    }
}
