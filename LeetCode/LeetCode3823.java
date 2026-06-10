package LeetCode;

class LeetCode3823 {
    public static void main(String[] args)
    {
        String s = ")ebc#da@f(";
        System.out.print(reverseByType(s));
    }

    public static String reverseByType(String s) 
    {
        char[] arr = s.toCharArray();

        int start = 0;
        int end = arr.length-1;

        while (start < end) 
        {
            if(!Character.isLetter(arr[start]) && start < end)
            {
                start++;
            }
            else if(!Character.isLetter(arr[end]) && start < end)
            {
                end--;
            }
            else
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        start = 0;
        end = arr.length-1;

        while (start < end) 
        {
            if(Character.isLetter(arr[start]) && start < end)
            {
                start++;
            }
            else if(Character.isLetter(arr[end]) && start < end)
            {
                end--;
            }
            else
            {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }


        return new String(arr);
    }
}