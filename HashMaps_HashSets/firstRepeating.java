

import java.util.HashSet;

public class firstRepeating {
    public static void main(String[] args) {
        int[] arr = {0,4,6,2,27,6};

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                System.out.println(arr[i]);
                break;
            }
            set.add(arr[i]);
        }

        
    }
}
