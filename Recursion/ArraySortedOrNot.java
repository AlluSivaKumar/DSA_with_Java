package Recursion;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,19,10,11,16};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr,int index) {
        //Base Condition
        if(index == arr.length-1)
        {
            return true;
        }
        return arr[index] < arr[index+1] && sorted(arr, index+1);

        /* if(arr[index] < arr[index+1])
        {
            return sorted(arr, index+1);
        }
        return false; */
    }
}
