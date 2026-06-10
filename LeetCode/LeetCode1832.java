package LeetCode;

public class LeetCode1832 {
    public static void main(String[] args) {
        String word = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(word));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean result = false;
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i=0;i<26;i++)
        {
            if(sentence.contains(arr[i]))
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }
}
