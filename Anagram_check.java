import java.util.*;

public class Solution {

    public static boolean areAnagrams(String s1, String s2) {

        // Step 1: If lengths are different, they can never be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: HashMap to store frequency of characters in s1
        // Key   -> character
        // Value -> number of times the character appears
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 3: Count frequency of each character in s1
        for (char c : s1.toCharArray()) {

            // getOrDefault(c, 0) returns:
            // - current count if 'c' exists
            // - 0 if 'c' does not exist
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 4: Reduce frequency using characters from s2
        for (char c : s2.toCharArray()) {

            // If character is not present in map,
            // then s2 has an extra character → not an anagram
            if (!map.containsKey(c)) {
                return false;
            }

            // Decrease the count for the matched character
            map.put(c, map.get(c) - 1);

            // If count becomes 0, remove the character from map
            // This keeps the map clean and small
            if (map.get(c) == 0) {
                map.remove(c);
            }
        }

        // Step 5: If map is empty, all characters matched perfectly
        return map.isEmpty();
    }
}