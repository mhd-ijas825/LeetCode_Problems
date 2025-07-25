class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n=num.length-1;
        while(n>=0 || k>0){
            if(n>=0){
                k=k+num[n];
                n--;
            }
            arr.add(0,k%10);
            k=k/10;
        }
        return arr;
    }
}