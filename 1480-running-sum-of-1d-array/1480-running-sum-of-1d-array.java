class Solution {
    public int[] runningSum(int[] nums) {
       int arr[]=new int[nums.length];
        arr[0]=nums[0];
       int sum =nums[0];
       for(int i=1 ; i<nums.length ; i++){
        sum+=nums[i];
        arr[i]=sum;
       }
       return arr;
        }
    }
