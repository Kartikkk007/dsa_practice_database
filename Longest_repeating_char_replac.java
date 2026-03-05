class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26]; 
        int maxFreq = 0;               
        int start = 0;                 
        int maxLength = 0;

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charCount[currentChar - 'A']++;


            maxFreq = Math.max(maxFreq, charCount[currentChar - 'A']);

            while ((end - start + 1) - maxFreq > k) {
                charCount[s.charAt(start) - 'A']--;
                start++; 
            }

      
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}