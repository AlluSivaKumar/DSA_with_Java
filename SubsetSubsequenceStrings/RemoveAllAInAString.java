package SubsetSubsequenceStrings;

public class RemoveAllAInAString 
{
    public static void main(String[] args) 
    {
        String str = "baccad"; 
        String ans = "";
        System.out.println(approach1(str));
        System.out.println(approach2(str, ans));
        System.out.println(approach3(str));
    }


    //with using recursion and without passing an argument
    static String approach3(String str)
    {
        if(str.isEmpty())
        {
            return "";
        }
        
        if(str.charAt(0) == 'a')
        {
            return approach3(str.substring(1));
        }
        else
        {
            return str.charAt(0) + approach3(str.substring(1));
        }
    }


    //with using recursion and passing an argument
    static String approach2(String str , String ans)
    {
        if(str.isEmpty())
        {
            return ans;
        }
        if(str.charAt(0) == 'a')
        {
            return approach2(str.substring(1), ans);
        }
        else
        {
            return approach2(str.substring(1), ans + str.charAt(0));
        }
    }


    //without using recursion only using loops
    static String approach1(String str)
    {
        String ans = "";
        for(int i = 0; i < str.length();i++)
        {
            if(str.charAt(i) != 'a')
            {
                ans = ans+str.charAt(i);
            }
        }
        return ans;   
    }
}
