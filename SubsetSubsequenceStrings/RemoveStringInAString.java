package SubsetSubsequenceStrings;

public class RemoveStringInAString 
{
    public static void main(String[] args) 
    {
        String str = "abvecapplekhapple";
        String ans = "";
        System.out.println(removeApple(str));
        System.out.println(removeApple2(str, ans));
    }

    //Using recursion with passing argument in the function
    static String removeApple2(String str,String ans)
    {
        if(str.isEmpty())
        {
            return ans;
        }

        if(str.startsWith("apple"))
        {
            return removeApple2(str.substring(5), ans);
        }
        else
        {
            return removeApple2(str.substring(1) , ans + str.charAt(0));
        }
    }


    //Using recursion without passing ans argument int the function
    static String removeApple(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }

        if(str.startsWith("apple"))
        {
            return removeApple(str.substring(5));
        }
        else
        {
            return str.charAt(0) + removeApple(str.substring(1));
        }
    }
}
