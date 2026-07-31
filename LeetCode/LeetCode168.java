package LeetCode;

import java.util.Scanner;

public class LeetCode168 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convertToTitle(n));
        sc.close();
    }

    public static String convertToTitle(int columnNumber) 
    {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0)
        {
            columnNumber--;
            char ch = (char)('A' + columnNumber % 26);
            sb.append(ch);
            columnNumber /= 26;
        }
        sb.reverse();
        return sb.toString();
    }
}
