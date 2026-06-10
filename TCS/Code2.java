/* Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal */

package TCS;

import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ('*' an '#') only : ");
        String input = sc.nextLine();
        System.out.println(stringValidOutput(input));
        sc.close();
    }

    public static int stringValidOutput(String str)
    {
        int stars = 0;
        int hashs = 0;
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == '*')
            {
                stars++;
            }
            else if(str.charAt(i) == '#')
            {
                hashs++;
            }
            else
            {
                System.out.println("You enter invalid Input");
                return 0;
            }
        }
        return stars-hashs;
    }
}
