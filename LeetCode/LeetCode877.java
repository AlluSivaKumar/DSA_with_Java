package LeetCode;

public class LeetCode877
{
    static void main()
    {
        int[] stones = {5,3,4,5};
        System.out.println(stoneGame(stones));
    }

    public static boolean stoneGame(int[] piles)
    {
        int start = 0;
        int end = piles.length-1;

        int alice = 0;
        int bob = 0;

        while (start < end)
        {
            if(piles[start] > piles[end])
            {
                alice += piles[start];
                start++;
            }
            else
            {
                alice += piles[end];
                end--;
            }

            if(piles[start] > piles[end])
            {
                bob += piles[start];
                start++;
            }
            else
            {
                bob += piles[end];
                end--;
            }
        }
        return  alice > bob;
    }
}
