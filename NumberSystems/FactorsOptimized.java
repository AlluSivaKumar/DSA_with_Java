package NumberSystems;

public class FactorsOptimized {
    public static void main(String[] args) {
        factors(20);
    }

    static void factors(int num)
    {
        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
