package LeetCode;

import java.util.*;

public class LeetCode3016 {
    public static void main(String[] args) 
    {
        String word = "aabbccddeeffgghhiiiiii";
        System.out.println(minimumPushes(word));
    }

    public static int minimumPushes(String word) 
    {
        int pushes = 0;
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char ch : word.toCharArray())
        {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
        ArrayList<Integer> list = new ArrayList<>();
        for(int tot : freq.values())
        {
            list.add(tot);
        }
        System.out.println(list);
        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            int value = (i / 8) + 1;
           // int sum = ;
            pushes += value * list.get(i);
        }






















        
        //list.sort(list);

        //int n = freq.size();
        //int counter = 0;


        /* for(int tot : freq.values())
        {
            if(counter < n)
            {
                if(counter < 8)
                {
                    pushes += 1 * tot;
                }
                if(counter >= 8 && counter <16)
                {
                    pushes += 2 * tot;
                }
                if(counter >= 16 && counter < 24)
                {
                    pushes += 3 * tot;
                }
                if(counter >= 24 && counter < 26)
                {
                    pushes += 4 * tot;
                }
                counter++;
            }
        } */
        return pushes;
    }
}
