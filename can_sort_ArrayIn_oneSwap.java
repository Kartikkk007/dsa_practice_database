import java.util.*;

public class Solution {

    public static boolean canBeSortedByOneSwap(int[] arr) {

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int count = 0;

        // Count mismatched positions
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sorted[i]) {
                count++;
            }
        }

        // If 0 mismatches → already sorted
        // If 2 mismatches → one swap fixes it
        return count == 0 || count == 2;
    }
}