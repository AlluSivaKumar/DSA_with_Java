package LeetCode;

public class LeetCode278 {
    public static void main(String[] args) {
        
    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start <= end)
        {
            int mid = start + (end-start)/2;

            if(isBadVersion(mid))
            {
                end = mid;
            }
            else
            {
                start = mid;
            }
        }

        return start;
    }

    public static boolean isBadVersion(int n)
    {
        return true;
    }

}
