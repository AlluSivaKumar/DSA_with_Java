package LeetCode;

/**
 * LeetCode657
 */
public class LeetCode657 {

    public static void main(String[] args) 
    {
        String str = "LDRRLRUULR";
        System.out.println(judgeCircle(str));
    }

    public static boolean judgeCircle(String moves) 
    {
        int origin = 0;

        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i) == 'U')
            {
                origin += 1;
            }

            if(moves.charAt(i) == 'D')
            {
                origin += -1;
            }

            if(moves.charAt(i) == 'L')
            {
                origin += 1;
            }

            if(moves.charAt(i) == 'R')
            {
                origin += -1;
            }
        }

        return origin == 0;
    
    }
}