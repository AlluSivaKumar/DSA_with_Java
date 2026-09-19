package T2_Loops;

import java.util.Scanner;

public class T1_ForLoop {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            System.out.println(i);
        }

        sc.close();
    }
}
