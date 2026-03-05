import java.util.*;

public class Solution {

    public static List<String> breakAndReverse(String s, int n) {

        List<String> result = new ArrayList<>();

        // Traverse string in chunks of size n
        for (int i = 0; i < s.length(); i += n) {

            // Extract substring (handle last smaller chunk)
            String part = s.substring(i, Math.min(i + n, s.length()));

            // Reverse substring
            String reversed = new StringBuilder(part).reverse().toString();

            // Add to result list
            result.add(reversed);
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefgh";
        int n = 3;

        System.out.println(breakAndReverse(s, n));
    }
}