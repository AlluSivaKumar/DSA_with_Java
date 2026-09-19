package T2_Loops;

import java.util.Scanner;

public class T2_WhileLoop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}
