package LeetCode;

import java.util.Arrays;

class LeeCode2037
{
    public static void main(String[] args) 
    {
        int[] arr1 = {3,1,5};
        int[] arr2 = {2,7,4};
        System.out.println(minMovesToSeat(arr1, arr2));
    }

    public static int minMovesToSeat(int[] seats, int[] students) 
    {
        Arrays.sort(seats);
        Arrays.sort(students);

        int sum = 0;
        for(int i=0;i<seats.length;i++)
        {
            sum += Math.abs(seats[i] - students[i]);
        }

        return sum;
    }
}