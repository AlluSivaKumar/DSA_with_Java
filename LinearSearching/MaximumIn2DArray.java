package LinearSearching;

public class MaximumIn2DArray 
{
    public static void main(String[] args) 
    {
        int arr[][] = 
        {
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56},
            {18,12}
        };

        System.out.println(max(arr));
        System.out.println(min(arr));

    }

    static int max(int arr[][])
    {
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]>max)
                {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int min(int arr[][])
    {
        int min = arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]<min)
                {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
