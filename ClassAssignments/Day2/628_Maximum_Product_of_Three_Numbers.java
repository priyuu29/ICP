import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
      Arrays.sort(nums);
      int mul=1;
      int left=1;
      
      for(int i=0;i<2;i++){
        mul*=nums[i];
      }
      mul*=nums[nums.length-1];
      for(int i=nums.length-1;i>=nums.length-3;i--){
        left*=nums[i];
      }
      return Math.max(mul,left);
    }
}