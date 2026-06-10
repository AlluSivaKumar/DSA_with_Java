package NumberSystems;

public class Factors {
    public static void main(String[] args) {
        factors(5_68_78_976);
    }

    static void factors(long num)
    {
        for(long i=1;i<=num;i++) {
            if(num % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
