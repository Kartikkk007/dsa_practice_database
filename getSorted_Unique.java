import java.util.*;

public class Solution {

    public static int[] unionSortedUnique(int[] arr1, int[] arr2) {

        // Step 1: Remove duplicates using HashSet
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        // Step 2: Convert to list
        List<Integer> list = new ArrayList<>(set);

        // Step 3: Sort the list
        Collections.sort(list);

        // Step 4: Convert to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}