class Solution {
    public int[] getConcatenation(int[] nums) {
        int l=nums.length;
        int arr[]=new int[l*2];
        for(int i=0 ; i<l;i++){
            arr[i]=nums[i];
            arr[i+l]=nums[i];
        }
        return arr;
    }
}