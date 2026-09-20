package LeetCode;

public class LeetCode3498 {
    public static void main(String[] args) 
    {
        String name =  "abc";
        System.out.println(reverseDegree(name));
    }

    public static int reverseDegree(String s) 
    {
        int res = 0;
        for(int i=0;i<s.length();i++)
        {
            res = res + (27 - ((int)s.charAt(i) - 96))  * (i + 1);
        }
        return res;
    }
}
