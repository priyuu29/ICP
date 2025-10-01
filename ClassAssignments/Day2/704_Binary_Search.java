class Solution {
    public int search(int[] nums, int target) {
        return binary(nums,target);
    }
    int binary(int [] arr,int a){
        int ans=-1;
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==a){
                ans=mid;
                return ans;
            }
            else if(arr[mid]>a){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }

}