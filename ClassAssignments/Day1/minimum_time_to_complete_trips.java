import java.util.*;
class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long lo=Arrays.stream(time).min().getAsInt();
        long hi=lo*totalTrips;
        long ans=0;
        while(lo<=hi){
            long mid=lo+(hi-lo)/2;
            if(isit(mid,time)>=totalTrips){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
    }
    public long isit(long mid,int[] time){
        long h=0;
        for(int i:time){
            h+=mid/i;
        }
        return h;
    }
}