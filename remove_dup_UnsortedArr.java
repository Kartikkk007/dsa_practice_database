import java.util.*;

public class Solution {
    public static int[] removeDuplicates(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                result.add(num);
            }
        }

        // convert ArrayList to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}