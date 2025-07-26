class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        double[] arr=new double[m+n];
        for(int i=0 ; i<m ; i++){
            arr[i]=nums1[i];
        }
        for(int i=0 ; i<n ; i++){
            arr[m+i]=nums2[i];
        }
        Arrays.sort(arr);
        int value=arr.length;
        double mid=0;
        if(value%2!=0){
            return mid=(arr[value/2]);
        }
        else{
           return mid=(((arr[value/2])+arr[value/2-1])/2);
        }
    }
}