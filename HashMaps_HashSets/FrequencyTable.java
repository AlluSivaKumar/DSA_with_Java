import java.util.HashMap;

public class FrequencyTable {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','a','c','a'};

        HashMap<Character,Integer> freqency = new HashMap<>();

        for(char ch : arr)
        {
            freqency.put(ch, freqency.getOrDefault(ch, 0) + 1);
        }
        
        System.out.println(freqency);
    }
}
