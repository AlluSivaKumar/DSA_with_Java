package LeetCode;

class LeetCode1967
{
    public static void main(String[] args) 
    {
        
    }

    public int numOfStrings(String[] patterns, String word) 
    {
        int count = 0;

        for(String each : patterns)
        {
            if(word.contains(each))
            {
                count++;
            }
        }
        return count;
    }
}