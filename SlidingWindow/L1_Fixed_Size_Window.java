package SlidingWindow;
import java.util.Scanner;

/* 
nums = [2, 1, 5, 1, 3, 2]
k = 3
Find the maximum sum of any 3 consecutive elements.
 */

public class L1_Fixed_Size_Window 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the Size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the subArray : ");
        int k = sc.nextInt();
        System.out.println(maximum_sum_of_consuctive_elements_with_fixed_size(arr, k));
        sc.close();
    }

    public static int maximum_sum_of_consuctive_elements_with_fixed_size(int[] arr, int k)
    {
        int windowSum = 0;
        for(int i=0;i<k;i++)
        {
            windowSum += arr[i];
        }   

        int j = 0;
        int longSum = windowSum;
        
        while (k < arr.length) 
        {
            windowSum = windowSum + arr[k] - arr[j];
            k++;
            j++;
            if(windowSum > longSum)
            {
                longSum = windowSum;
            }
        }

        return longSum;
    }

    public static int maximum_sum_of_consuctive_elements_with_fixed_size2(int[] arr, int k)
    {
        int left = 0;

        int windowSum = 0;
        int maxSum = 0;

        for(int right = 0; right < arr.length; right++)
        {
            windowSum += arr[right];

            // Window size > k
            if(right - left + 1 > k)
            {
                windowSum -= arr[left];
                left++;
            }

            // Window size == k
            if(right - left + 1 == k)
            {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        return maxSum;
    }

}
