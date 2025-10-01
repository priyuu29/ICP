import java.util.*;
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        return binary(position,m);
    }
    int binary(int [] arr,int m){
        int ans=0;
        int s=1, e=arr[arr.length-1]-arr[0];
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isit(arr,mid,m)){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
    boolean isit(int [] arr,int mid,int m){
        int c=1;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-curr>=mid){
                c++;
                curr=arr[i];
            }
            if(c==m) return true;
        }
        return false;
    }
}