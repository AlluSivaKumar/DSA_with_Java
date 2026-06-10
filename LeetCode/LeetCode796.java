package LeetCode;

public class LeetCode796 {

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }


    public static boolean rotateString(String s, String goal) 
    {
        if(s.length() != goal.length())
        {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = goal.toCharArray();

        
        for(int i=0;i<arr1.length;i++)
        {
            int[] arr3 = reverse(arr2, i);

        }
    }

    public static int[] reverse(char[] arr , int k)
    {

    }

}