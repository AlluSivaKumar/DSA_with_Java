package SubsetSubsequenceStrings;

public class SubsetsUsingRecursion 
{
    public static void main(String[] args) 
    {
        String str = "abc";
        String ans = "";
        subsets(str, ans);
    }

    static void subsets(String str,String ans)
    {
        if(str.isEmpty())
        {
            System.out.println(ans);
            return;
        }

        subsets(str.substring(1), ans+str.charAt(0));
        subsets(str.substring(1), ans);
    }
}
