class Solution {
    public char findTheDifference(String s, String t) {
        int a=s.length();
        int b=t.length();
        int arr=0;
        int arr1=0;
        for(int i=0 ; i<a ; i++){
            arr+=(int)s.charAt(i);
        }
        for(int i=0 ; i<b ; i++){
            arr1+=(int)t.charAt(i);
        }
        int ans=arr1-arr;
        char ch=(char)ans;
        return ch;
    }
}