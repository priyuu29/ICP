import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        int i=0;
        int j=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                ans++;
                i++;
                j++; 
            } 
            else{
                 j++;

            }
        }
        return ans;
    }
}