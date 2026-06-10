package Sorting;

import java.util.Arrays;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {2,8,4,9};
        //sorting(arr, arr.length-1, 0);
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    }




    //using loops
    public static void Sorting(int[] arr)
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
            swapped = false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j] < arr[j-1])
                {
                    //SWAPPING
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            //If you did not swap it will break , means it is also sorted.
            if(!swapped)
            {
                break;
            }
        }
    }


    //Using Recursion
    static void sorting(int[] arr,int i,int j)
    {
        if(i==0)
        {
            return;
        }

        if(j < i)
        {
            if(arr[j] > arr[j+1])//Ascending Order
            {
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            sorting(arr, i, j+1);
        }
        sorting(arr, i-1, j);
    }
}
