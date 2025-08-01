class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int reverse=0;
        for(int num:nums){
            if(num%2==0){
                arr[reverse++]=num;
            }
        }
        for(int num:nums){
            if(num%2!=0){
                arr[reverse++]=num;
            }
        }
        return arr;
    }
}