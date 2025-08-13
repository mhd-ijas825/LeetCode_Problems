class Solution {
    public int longestPalindrome(String s) {
        int len=s.length();
        int fre[]=new int[128];
        for(char c:s.toCharArray())
        {
            fre[c]++;
        }
        int count=0,flag=1;
        for(int i=0;i<128;i++)
        {
            if(fre[i]!=0 && fre[i]%2==0)
            {
                count+=fre[i];
            }
            else if(fre[i]!=0)
            {
                count+=fre[i]-1;
                flag=0;
            }
        }
        if(flag==0)
        count++;
        return count;
    }
}