package LeetCode;

public class LeetCode2710 {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }

    public static String removeTrailingZeros(String num) 
    {
        StringBuilder sb = new StringBuilder();

        sb.append(num);

        int i = num.length()-1;

        while(num.charAt(i) == '0')
        {
            sb.deleteCharAt(i);
            i--;
        }

        return sb.toString();
    }
}
