package LeetCode;

import java.util.HashSet;

class LeetCode575
{
    public static void main(String[] args) 
    {
        int[] arr = {6,6,6,6};
        System.out.println(distributeCandies(arr));
    }

    public static int distributeCandies(int[] candyType) 
    {
        int n = candyType.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<candyType.length;i++)
        {
            set.add(candyType[i]);
        }

        if(n <= set.size())
        {
            return n;
        }
        else
        {
            return set.size();
        }
    }
}