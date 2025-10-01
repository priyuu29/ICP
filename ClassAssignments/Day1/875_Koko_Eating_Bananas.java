import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=Arrays.stream(piles).max().getAsInt();
        return binary(lo, hi ,h,piles);
    }
    public int binary(int min,int sum,int h,int [] piles){
        int lo=min;
        int hi=sum;
        int ans=hi;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isit(mid,h,piles)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public boolean isit(int mid,int h,int piles[]){
        long r=0;
        for(int i:piles){
           r+=(i+mid-1)/mid;
        }
        return r<=h;
    }
}