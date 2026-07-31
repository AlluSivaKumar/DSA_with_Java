package LeetCode;

import java.util.HashSet;
import java.util.Stack;

public class LeetCode1081 {

    public static void main(String[] args) {
        String str = "bcabc";
        System.out.println(smallestSubsequence(str));

        str = "cbacdcbc";
        System.out.println(smallestSubsequence(str));
    }

    public static String smallestSubsequence(String s) {

        int n = s.length();

        // Stores the last occurrence of every character
        int[] last = new int[26];

        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            // Skip if already present
            if (set.contains(ch)) {
                continue;
            }

            // Remove larger characters if they appear later
            while (!stack.isEmpty()) {

                char prev = stack.peek();

                if (prev > ch && last[prev - 'a'] > i) {
                    stack.pop();
                    set.remove(prev);
                } else {
                    break;
                }
            }

            stack.push(ch);
            set.add(ch);
        }

        // Build answer
        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}