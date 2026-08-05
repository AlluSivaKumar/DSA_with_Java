package LeetCode;

import java.util.*;

public class LeetCode39 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> result = new ArrayList<>();

        int n=  candidates.length;
        for(int i=0;i<n;i++)
        {
            int sum = candidates[i];
            for(int j=i+1;j<n;j++)
            {
                sum += candidates[j];
                if(sum == target)
                {
                    List<Integer> list = new ArrayList<>();
                    for(int k =i;k<=j;k++)
                    {
                        list.add(candidates[k]);
                    }
                    result.add(list);
                }
            }
        }
        return result;
    }
}