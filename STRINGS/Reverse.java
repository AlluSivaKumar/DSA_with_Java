package STRINGS;

import java.util.Scanner;

public class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println(reverseAString(str));
        System.out.println(reverseAString2(str));

        //DIRECTLY WITHOUT FUNCTION
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            revStr = revStr + str.charAt(i);
        }
        System.out.println(revStr);

        sc.close();
    }

    //USING STRING BUILDER METHOD
    public static String reverseAString(String str)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            sb = sb.append(str.charAt(i));
        }

        String ans = sb.toString();
        return ans;
    }

    //DIRECT REVERSE FUNCTION
    public static String reverseAString2(String str)
    {
        StringBuilder sb = new StringBuilder();
        sb = sb.append(str);
        sb.reverse();

        String revStr = sb.toString();

        return revStr;
    }
}
