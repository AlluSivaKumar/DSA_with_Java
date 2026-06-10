package LeetCode;

public class LeetCode171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("CCD"));
    }

    public static int titleToNumber(String columnTitle) 
    {
        int num = 0;

        int len = columnTitle.length();

        for(int i=0;i<len;i++)
        {
            num += (int)(Math.pow(26 , len-i-1 ) * (int)(columnTitle.charAt(i) - 'A' + 1)) ;
        }

        return num;
    }
}
