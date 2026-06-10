package LinearSearching;

public class LinearMinimum {
    public static void main(String[] args) {
        int arr[] = {34,65,23,12,456,78};
        System.out.println(Minimum(arr));
    }

    static int Minimum(int[] arr)
    {
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}
