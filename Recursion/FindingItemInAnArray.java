package Recursion;

import java.util.ArrayList;

public class FindingItemInAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,3,7,7,10};
        System.out.println(finding(arr,10));
        findAll(arr, 7, 0);
        System.out.println(list);
        ArrayList<Integer> ans = findingAll(arr, 7,0,new ArrayList<>());
        System.out.println(ans);
    }

    static int finding(int[] arr,int tatget) {
        return helper(arr,tatget,0);
    }
    static int helper(int[] arr,int tatget,int index) {
        if(index == arr.length)
        {
            return -1;
        }

        if(arr[index] == tatget)
        {
            return index;
        }
        return helper(arr, tatget, index+1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] arr,int tatget,int index) {
        if(index == arr.length)
        {
            return;
        }
        if(arr[index] == tatget)
        {
            list.add(index);
        }
        findAll(arr, tatget, index+1);
    }


    static ArrayList<Integer> findingAll(int[] arr,int tatget,int index, ArrayList<Integer> list) {
        if(index == arr.length)
        {
            return list;
        }
        if(arr[index] == tatget)
        {
            list.add(index);
        }
        return findingAll(arr, tatget, index+1, list);
    }
}
