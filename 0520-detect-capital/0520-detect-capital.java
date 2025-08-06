class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        return (upper == n) || (upper == 0) || (upper == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}