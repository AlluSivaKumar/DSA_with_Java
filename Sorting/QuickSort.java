package Sorting;

import java.util.Arrays;

public class QuickSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,6,9,1,8,2,5};
        sorting(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr, int low , int high)
    {
        if(low >= high)
        {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e-s) / 2;

        int pivot = arr[mid];

        while (s <= e) 
        {
            //if it already sorted it not swapped
            while (arr[s] < pivot) 
            {
                s++;
            } 
            while (arr[e] > pivot) 
            {
                e--;
            } 
            if(s <= e)
            {
                int temp = arr[s];
                arr[s] = arr[e];  
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sorting(arr, low, e);
        sorting(arr, s, high);
    }
}

