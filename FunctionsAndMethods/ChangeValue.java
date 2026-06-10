package FunctionsAndMethods;

import java.util.Arrays;

public class ChangeValue 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,3,5,6,8};
        System.out.println(Arrays.toString(arr));


        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int arr[])
    {
        arr[0] = 99;
        arr[3] = 98;
    }
}
