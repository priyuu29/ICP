class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean isit=false;
        int nn=flowerbed.length;
        if(n==0) return true;
        for(int i=0;i<nn;i++){
            if(flowerbed[i]==0 &&(i==0 || flowerbed[i-1]==0) &&(i==nn-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
                // i=i+2;
                if(n==0) isit=true;
            }
        }
        return isit;
    }
}