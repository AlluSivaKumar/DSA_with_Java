package RecursionPermutations;

public class Code 
{
    public static void main(String[] args) 
    {
        String str = "abc";
        String ans = "";
        permutaions(ans,str);
    }

    static void permutaions(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++)
        {
            String first = p.substring(0,i);
            String last = p.substring(i,p.length());
 
            permutaions(first + ch + last, up.substring(1));
        }
    }
}
