class Solution {
    public String addBinary(String a, String b) {
         int lenA = a.length();
        int lenB = b.length();
        int maxLen = (lenA > lenB) ? lenA : lenB;

        char[] result = new char[maxLen + 1]; 
        int i = lenA - 1;
        int j = lenB - 1;
        int k = maxLen; 
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = bitA + bitB + carry;
            result[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            i--;
            j--;
            k--;
        }
        if (carry == 1) {
            result[k] = '1';
        } else {
            k++; 
        }
        String output = "";
        for (int x = k; x <= maxLen; x++) {
            output = output + result[x];
        }

        return output;
    }
}