package LeetCode;

public class LeetCode1108 {
    public static void main(String[] args) {
        String ipAdress = "1.1.1.1";
        System.out.println(defangIPaddr(ipAdress));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++)
        {
            char ch = address.charAt(i);
            if(ch != '.')
            {
                sb.append(ch);
            }
            else
            {
                sb.append("[.]");
            }
        }

        return sb.toString();
    }
}
