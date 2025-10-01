import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int [] ans=new int[arr1.length+arr2.length];
        int n=ans.length;
        double median=0.0f;
        merge(arr1,arr2,ans);
        Arrays.sort(ans);
        if(n%2==0){
            int t=ans[(n/2)-1]+ans[(n/2)];
            median=t/2.0;
        }
        else{
            median=ans[(n+1)/2-1];
        }
        System.out.println(Arrays.toString(ans));
        return median;
    }
    void merge(int [] arr1,int [] arr2,int [] ans){
        int i=0;
        int g=0;
       while(i<arr1.length){
            ans[g]=arr1[i];
            i++;
            g++;
       }
       i=0;
       while(i<arr2.length){
            ans[g]=arr2[i];
            i++;
            g++;
       }
    }
}