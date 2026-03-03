import java.util.*;

class Solution {

    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int longest = 0;

        int i = 1;
        while (i < n - 1) {
            // check peak
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                int left = i - 1;
                int right = i + 1;

                while (left > 0 && arr[left] > arr[left - 1]) left--;
                while (right < n - 1 && arr[right] > arr[right + 1]) right++;

                longest = Math.max(longest, right - left + 1);
                i = right;
            } else {
                i++;
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        // Example test case 1
        int[] arr1 = {2,1,4,7,3,2,5};
        System.out.println(longestMountain(arr1)); // expected 5

        // Example test case 2
        int[] arr2 = {2,2,2};
        System.out.println(longestMountain(arr2)); // expected 0
    }
}