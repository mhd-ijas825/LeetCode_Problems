class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0 ; i<columnTitle.length() ; i++){
            char m=columnTitle.charAt(i);
            result=result*26+(m -'A'+1);
        }
        return result;
    }
}