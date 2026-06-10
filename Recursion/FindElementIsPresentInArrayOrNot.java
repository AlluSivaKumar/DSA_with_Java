package Recursion;

public class FindElementIsPresentInArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,9,1,11,45};
        System.out.println(finding(arr,90,0));
    }

    static boolean finding(int[] arr,int tatget,int index)
    {
        //Base Condition - 1
        if(index == arr.length)
        {
            return false;
        }

        //Base Condition - 2
        if(arr[index] == tatget)
        {
            return true;
        }
        else
        {
            return finding(arr, tatget, index+1);
        }
    }
}
