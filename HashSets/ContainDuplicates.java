package HashSets;

import java.util.HashSet;

public class ContainDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,6,8,1,0};

        System.out.println(isContainDuplicates(arr));

    }

    public static boolean isContainDuplicates(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                return true;
            }
            set.add(arr[i]);
        }

        return false;
    }
}
