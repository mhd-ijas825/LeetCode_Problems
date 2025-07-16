class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr=new int [gain.length+1];
        arr[0]=0;
        arr[1]=gain[0];
        for(int i=2 ; i<arr.length ; i++){
            arr[i]=arr[i-1]+gain[i-1];
        }
        int max=0;
        for(int i=0 ; i<arr.length ; i++){       
            max=Math.max(arr[i],max);
        }
        
        return max;
    }
}