package LeetCode;

public class LeetCode434 {
    public static void main(String[] args) {
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) 
    {
        if(s == null || s.length()<=0)
        {
            return 0;
        }

        String[] array = s.split(" ");
        //System.out.println(Arrays.toString(array));
        int count = 0;
        for(String str : array)
        {
            if(!str.equals(""))
            {
                count++;
            }
        }
        return count;
    }
}
