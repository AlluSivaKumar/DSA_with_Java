package RecursionPermutations;

public class DiceOfGettingNumber 
{
    public static void main(String[] args) 
    {
        dice(4,"");
    }

    static void dice(int target,String ans)
    {
        if(target == 0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=1 ; i <= 6 && i <= target ; i++)
        {
            dice(target - i, ans + i);
        }
    }
}
