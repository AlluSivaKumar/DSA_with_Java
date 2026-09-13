package StringBuffer;

import java.util.Random;

public class RandomString 
{
    static String generate(int size)
    {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i=0;i<size;i++)
        {
            int randomCharacterNumber = 97 + (int)(random.nextFloat() * 26);
            char ch = (char)randomCharacterNumber;
            sb.append(ch);
        }

        return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(generate(5));
        System.out.println(generate(10));
    }
}
