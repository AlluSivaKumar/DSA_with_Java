package LeetCode;

/**
 * LeetCode3014
 */
public class LeetCode3014 {

    public static void main(String[] args) {
        //System.out.println("aec".compareTo("abd"));
        String word = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(minimumPushes(word));
    }

    public static int minimumPushes(String word) 
    {
        int len = 0;

        int n = word.length();

        if(n < 8)
        {
            return n;
        }
        else
        {
            len += 8;
        }

        n = n -8;

        if(n <= 8)
        {
            return len + n*2;
        }
        else
        {
            len += 8*2;
        }

        n = n - 8;

        if(n <= 8)
        {
            return len + n*3;
        }
        else
        {
            len += 8*3;
        }

        n = n - 8;

        len += n*4;
        return len;
    }
}