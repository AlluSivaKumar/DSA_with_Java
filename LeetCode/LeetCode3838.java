package LeetCode;

public class LeetCode3838 {
    public static void main(String[] args) {
        
    }

    public static String mapWordWeights(String[] words, int[] weights) 
    {
        StringBuilder sb = new StringBuilder();
        for(String word : words)
        {
            int len = WordLength(word,weights);
            int rem = len % 26;
            char ch = (char)('z'-rem);
            sb.append(ch);
        }
        return sb.toString();
    }

    public static int WordLength(String word, int[] weights)
    {
        int len = 0;
        for(int i=0;i<word.length();i++)
        {
            len += weights[word.charAt(i) - 'a'];
        }
        return len;
    }
}
