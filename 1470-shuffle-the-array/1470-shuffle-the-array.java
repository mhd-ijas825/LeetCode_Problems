class Solution {
    public int[] shuffle(int[] nums, int n) {
        int total[] = new int[2*n];
        for(int i=0 ; i<n ; i++){
            total[i*2] = nums[i];
            total[i*2+1] = nums[i+n];
        }
        return total;
    }
}