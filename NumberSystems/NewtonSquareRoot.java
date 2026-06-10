package NumberSystems;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        int num = 40;
        System.out.printf("%.3f",sqrt(num));
    }

    static double sqrt(int num)
    {
        double root;
        double x = num;
        while (true) {
            root = (0.5*(x + (num/x)));

            if(Math.abs(root-x) < 0.5)
            {
                break;
            }
            x = root;
        }

        return root;
    }
}
