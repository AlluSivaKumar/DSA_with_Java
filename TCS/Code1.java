/* Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.

The input format for testing 
The candidate has to write the code to accept two positive numbers separated by a new line.

First Input line – Accept value of V.
Second Input line- Accept value for W.
The output format for testing 

Written program code should generate two outputs, each separated by a single space character(see the example)
Additional messages in the output will result in the failure of test case */


package TCS;
import java.util.Arrays;
import java.util.Scanner;
public class Code1 
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Vehicles : ");
        int n = sc.nextInt();
        System.out.print("Enter the Number of Wheels : ");
        int m = sc.nextInt();
        System.out.println(Arrays.toString(NumberOfTwoAndFourWheelers(n,m)));
        System.out.println(Arrays.toString(NumberOfTwoAndFourWheelers2(n, m)));
        sc.close();
    }

    //BRUTEFORCE
    private static int[] NumberOfTwoAndFourWheelers(int n, int m) 
    {
        if(m < 2*n || m > 4*n || m % 2 != 0) {
            System.out.println("ENTER VALID INPUT!");
            return null;
        }
        int left = 0;
        int right = n;
        for(int i=0;i<n;i++)
        {
            if(left*2 + right*4 == m){
                return new int[]{left,right};
            }
            left++;
            right--;
        }
        return new int[]{-1,-1};
    }
    
    //NUMERICAL
    private static int[] NumberOfTwoAndFourWheelers2(int n, int m) 
    {
        if(m < 2*n || m > 4*n || m % 2 != 0) {
            System.out.println("ENTER VALID INPUT!");
            return null;
        }
        int fourwheelrs = (m-2*n)/2;
        int twowheelers = n - fourwheelrs;
        return new int[]{twowheelers,fourwheelrs};
    }
}