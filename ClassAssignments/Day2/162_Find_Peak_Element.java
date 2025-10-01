class Solution {
    public int findPeakElement(int[] nums) {
        return peak(nums);
    }
     public int peak(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid+1]<arr[mid]){
                end=mid;
            }
            else{
                start=mid+1;
               
            }
        }
        return start;
    }
}