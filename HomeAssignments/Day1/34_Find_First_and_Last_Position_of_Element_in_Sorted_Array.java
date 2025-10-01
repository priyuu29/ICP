class Solution {
    public int[] searchRange(int[] nums, int target) {
        return search(nums,target);
    }
    public int [] search(int[]nums,int target){
      int [] ans={-1,-1};
      ans[0]=find(nums,target,true);
      if(ans[0]!=-1){
        ans[1]=find(nums,target,false);
      }
      return ans;
    }
    public int find(int [] nums, int target,boolean isStart){
        int ans=-1;
       int start=0;
       int end=nums.length-1;
       while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(isStart){
                    end=mid-1;

                }
                else{
                    start=mid+1;
                }
                
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return ans;
    }
}