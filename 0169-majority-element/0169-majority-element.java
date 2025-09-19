class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=nums.length;
        int b=nums[a/2];
        return b;
    }
}