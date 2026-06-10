package Sorting;

import java.util.Arrays;

public class SelectionSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {7,4,8,2};
        //sorting(arr, arr.length, 0,0);
        Sorting(arr);
        System.out.println(Arrays.toString(arr));
    } 



    //BASIC APPROACH
    public static void Sorting(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int maxIndex = 0;

            int lastIndex = arr.length-i-1;
            
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[j] > arr[maxIndex])
                {
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, lastIndex);
        }
    }

    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }




    //USING RECURSION
    static void sorting(int[] arr, int i,int j,int max)
    {
        if(i==0)
        {
            return;
        }
        if(j < i)
        {
            
            if(arr[j] > arr[max])
            {
                sorting(arr, i, j+1 , j);
            }
            else
            {
                sorting(arr, i, j+1, max);
            }   
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[i-1];
            arr[i-1] = temp;
            sorting(arr, i-1, 0,0);
        }
    }
}
