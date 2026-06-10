package LinearSearching;

public class LinearSearch 
{
    public static void main(String[] args) 
    {
        int[] arr = {1,3,7,83,6,7,3,6,2,53,5,456};
        int res = linear(arr, 3);
        System.out.println(res);
    }


    static int linear(int[] arr , int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
