package LeetCode;

public class LeetCode2864 {
    public static void main(String[] args) {
        String s = "0101";
        System.out.println(maximumOddBinaryNumber(s));
    }

    public static String maximumOddBinaryNumber(String s) 
    {
        int n = s.length();
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '1')
            {
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        if(count == 1)
        {
            for(int i=0;i<n-1;i++)
            {
                sb.append('0');
            }
            sb.append('1');
        }

        if(count == 2)
        {
            int tagret = n - 2;
            sb.append('1');
            for(int i=1;i<=tagret;i++)
            {
                sb.append('0');
            }
            sb.append('1');
        }

        if(count >= 3)
        {
            int tagret = count - 1;
            int zeroesCount = n-count;
            for(int i=0;i<tagret;i++)
            {
                sb.append('1');
            }
            for(int i=tagret;i<zeroesCount+tagret;i++)
            {
                sb.append('0');
            }
            sb.append('1');
        }

        return sb.toString();
    }
}
