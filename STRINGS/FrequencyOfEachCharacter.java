package STRINGS;

import java.util.Scanner;

public class FrequencyOfEachCharacter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();

        frequency(str);
        frequency2(str);

        sc.close();
    }

    public static void frequency(String str)
    {
        char[] arr = str.toCharArray();

        boolean[] visited = new boolean[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            if(visited[i] == true)
            {
                continue;
            }
            else
            {
                int count  = 0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " : " + count);
            }
        }
    }

    public static void frequency2(String str)
    {
        int[] freq = new int[256];
        for(char c : str.toCharArray())
        {
            freq[c]++;
        }

        for(int i=0; i<256; i++)
        {
            if(freq[i] > 0)
            {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}
