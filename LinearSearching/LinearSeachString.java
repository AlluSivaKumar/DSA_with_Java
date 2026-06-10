package LinearSearching;

import java.util.Arrays;

public class LinearSeachString {
    public static void main(String[] args) {

        String name = "Siva Kumar Allu";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, 'k'));

    }

    static boolean search(String str, char target)
    {
        /* for(int i=0;i<str.length();i++)
        {
            if(target == str.toLowerCase().charAt(i))
            {
                return true;
            }
        } */

        for(char ch : str.toLowerCase().toCharArray())
        {
            if(target == ch)
            {
                return true;
            }
        }

        return false;
    }
}
