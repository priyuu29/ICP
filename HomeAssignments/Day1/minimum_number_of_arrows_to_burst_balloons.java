import java.util.*;
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int ans=0;int arc=0;
        for(int i=0;i<points.length;i++){
            if(ans==0 || points[i][0]>arc){
                ans++;
                arc=points[i][1];
            }
        }
        return ans;
    }
}