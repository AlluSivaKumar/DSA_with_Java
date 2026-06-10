package Sorting;
import java.util.Arrays;

public class MergeSort 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,6,9,4,1,5};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        arr = mergeSorting(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSorting(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length/2;
        int[] arr1 = mergeSorting(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = mergeSorting(Arrays.copyOfRange(arr, mid, arr.length));
        return mergeing(arr1,arr2);
    }

    static int[] mergeing(int[] first,int[] second)
    {
        int[] newArray = new int[first.length+ second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) 
        {
            if(first[i] < second[j])
            {
                newArray[k] = first[i];
                i++;
            }
            else
            {
                newArray[k] = second[j];
                j++;
            }
            k++;
        }
        //what if some elements are remained in the array if above while condition is voialiated
        while (i < first.length) 
        {
            newArray[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) 
        {
            newArray[k] = second[j];
            j++;
            k++;  
        }
        return newArray;
    }


    static void mergeSorting2(int[] arr,int start,int end)
    {
        if(end-start == 1)
        {
            return;
        }
        int mid = start + (end - start)/2;
        mergeSorting2(arr, start, mid);
        mergeSorting2(arr,mid,end);
        mergeing2(arr,start,mid,end);
    }
    static void mergeing2(int[] arr,int start,int mid,int end)
    {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) 
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }


        //if the while condition is voialiated  the remaining elements will be added
        while (i < mid) 
        {
            arr[k] = arr[i];
            i++;
            k++;   
        }
        while (j < end) 
        {
            arr[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, start, mix.length);
    }







    

    static void mergeSort(int[] arr,int start,int end)
    {
        if(end-start == 1)
        {
            return;
        }
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr,start,mid,end);
    }  
    static void merge(int[] arr,int start,int mid,int end)
    {
        int mix[] = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) 
        {
        if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else
            {
                mix[k] = arr[j];
                j++;
            }
            k++; 
        }

        while(i< mid)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, start, mix.length);
    }
}
