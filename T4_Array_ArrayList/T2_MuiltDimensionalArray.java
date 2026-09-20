package T4_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class T2_MuiltDimensionalArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new  Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        //TO PRINT AN ARRAY
        for(int[] nums : arr)
        {
            System.out.println(Arrays.toString(nums));
        }

        sc.close();
    }
}
