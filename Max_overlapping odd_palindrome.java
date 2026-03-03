public class Solution {

    public static int maxNonOverlappingPalindromeSum(String s) {

        int n = s.length();

        // Step 1: Precompute palindrome table
        boolean[][] isPal = new boolean[n][n];

        for (int end = 0; end < n; end++) {
            for (int start = 0; start <= end; start++) {

                if (s.charAt(start) == s.charAt(end)) {

                    // Length 1 or 2 OR inner substring is palindrome
                    if (end - start <= 2 || isPal[start + 1][end - 1]) {
                        isPal[start][end] = true;
                    }
                }
            }
        }

        // Step 2: DP array
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {

            // Option 1: carry previous best
            if (i > 0)
                dp[i] = dp[i - 1];

            for (int j = 0; j <= i; j++) {

                if (isPal[j][i]) {

                    int length = i - j + 1;

                    if (j > 0)
                        dp[i] = Math.max(dp[i], dp[j - 1] + length);
                    else
                        dp[i] = Math.max(dp[i], length);
                }
            }
        }

        return dp[n - 1];
    }
}