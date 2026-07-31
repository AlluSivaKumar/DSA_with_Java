

import java.util.HashSet;

public class CountUniqueElements 
{
    public static void main(String[] args) 
    {
        int[] arr = {8,2,4,2,3,2,9,4,7};

        //int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set.size());
    }
}
