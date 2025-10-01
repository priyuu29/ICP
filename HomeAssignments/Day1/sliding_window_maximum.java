import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int j=0;
        int [] ans=new int[n-k+1];
        Deque<Integer> q= new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(q.size()>0 && nums[i]>=nums[q.peekLast()]){
                q.pollLast();
            }
            q.addLast(i);
        }
        for(int i=k;i<n;i++){
            ans[j++]=nums[q.peekFirst()];
            
            while(q.size()>0 && q.peekFirst()<=i-k ){
                q.pollFirst();
            }
            while(q.size()>0 && nums[q.peekLast()]<=nums[i]){
                q.pollLast();
            }
            q.addLast(i);
        }
        ans[j]=nums[q.pollFirst()];
        return ans;

    }
}