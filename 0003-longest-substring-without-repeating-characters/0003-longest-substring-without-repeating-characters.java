class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            start = Math.max(index[c], start);
            maxLength = Math.max(maxLength, end - start + 1);
            index[c] = end + 1;
        }
        return maxLength;
    }
}