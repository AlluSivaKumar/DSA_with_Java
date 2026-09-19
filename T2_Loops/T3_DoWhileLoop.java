package T2_Loops;

import java.util.Scanner;

public class T3_DoWhileLoop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        //THIS LOOP RUN ATLEAST ONCE
        int i = 1;
        do
        {
            System.out.println(i + " ");
            i++;
        } 
        while (i <= n);
        
        sc.close();
    }
}
