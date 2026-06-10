/* A parking lot in a mall has RxC number of parking spaces. Each parking space will either be  empty(0) or full(1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find index of the prpeinzta row(R) in the parking lot that has the most of the parking spaces full(1).

Note :
RxC- Size of the matrix
Elements of the matrix M should be only 0 or 1.

Example 1:
Input :
3   -> Value of R(row)
3    -> value of C(column)
[0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is separated by new line.
Output :
3  -> Row 3 has maximum number of 1’s

Example 2:
input :
4 -> Value of R(row)
3 -> Value of C(column)
[0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
Output :
4  -> Row 4 has maximum number of 1’s */

package TCS;

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.print("Enter '1' for already parked and '0' for free space : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(MostFilledRow(arr));
        sc.close();
    }

    public static int MostFilledRow(int[][] arr)
    {
        if(arr == null || arr.length < 1)
        {
            return 0;
        }

        int count;
        int maxRow = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            count = 0;
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
            }
            if(count > maxCount)
            {
                maxCount = count;
                maxRow =  i;
            }
        }
        return maxRow+1;
    }
}
