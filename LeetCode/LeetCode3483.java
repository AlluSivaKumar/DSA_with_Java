package LeetCode;

public class LeetCode3483 {
    public static void main(String[] args) {
        System.out.println(totalNumbers(new int[] {1,2,3,4,5}));
    }

    public static int totalNumbers(int[] digits) 
    {
        int[] freq = new int[10];

        for(int digit : digits)
        {
            freq[digit]++;
        }

        int count = 0;

        //CHOOSE FROM CONSTRAINS - NUMBER SHOULD BE THREE DIGIT NUMBER
        for(int num=100;num<=999;num++)
        {
            if(num % 2 != 0)
            {
                continue;
            }

            int[] com = new int[10];
            int temp = num;

            int a = temp % 10;
            temp = temp / 10;
            com[a]++;

            int b = temp % 10;
            temp = temp / 10;
            com[b]++;

            int c = temp % 10;
            temp = temp / 10;
            com[c]++;

            if(com[a] <= freq[a] && com[b] <= freq[b] && com[c] <= freq[c])
            {
                count++;
            }
        }

        return count;

    }
}


/* 
class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> map = new HashSet<>();
        int n = digits.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != j && i != k && j != k) {
                        if (digits[i] != 0) {
                            if (digits[k] % 2 == 0) {
                                int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                                map.add(number);
                            }
                        }
                    }
                }
            }
        }
        return map.size();
    }
}
 */
