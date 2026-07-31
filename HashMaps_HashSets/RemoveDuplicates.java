

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,6,1,6,8,9,3,1,8,9};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }

        System.out.println(set);
    }

}
