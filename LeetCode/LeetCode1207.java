package LeetCode;

import java.util.HashSet;

class LeetCode1207
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,1,1,3,2};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) 
    {
        HashSet<Integer> set = new HashSet<>();

        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(!visited[i])
            {
                int count = 1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        count++;
                        visited[j] = true;
                    }
                }
                if(!set.contains(count))
                {
                    set.add(count);
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}