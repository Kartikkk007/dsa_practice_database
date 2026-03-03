import java.util.*;

public class ThirdMostFrequent {

    static Integer thirdMostFrequent(int[] arr) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map to list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(freq.entrySet());

        // Step 3: Sort by frequency (descending)
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Check size
        if (list.size() < 3) return null;

        // Step 5: Return 3rd most frequent
        return list.get(2).getKey();
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4};

        Integer result = thirdMostFrequent(arr);
        System.out.println(result);
    }
}
