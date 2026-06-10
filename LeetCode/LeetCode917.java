package LeetCode;

class LeetCode917 {
    public static void main(String[] args)
    {
        String s ="7_28]";
        System.out.print(reverseOnlyLetters(s));
    }

    public static String reverseOnlyLetters(String s) 
    {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = chars.length-1;

        while(start < end)
        {
            while(!Character.isLetter(chars[start]) && start < end)
            {
                start++;
            }

            while(!Character.isLetter(chars[end]) && start < end)
            {
                end--;
            }

            //SWAP
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        /* StringBuilder ans = new StringBuilder();

        for(int i=0;i<chars.length;i++)
        {
            ans.append(chars[i]);
        } */

        //return ans.toString();

        return new String(chars);
    }
}