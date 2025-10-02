class Solution {
    public boolean lemonadeChange(int[] bills) {
        int deno5=0;
        int deno10=0;
        for(int i:bills){
            if(i==5) {
                deno5++;
            }
            else if(i==10){
                if(deno5>0 ) {
                    deno10++;
                    deno5--;
                }
                else return false;
            }
            else{
                 if(deno5>0 && deno10>0) {
                    deno10--;
                    deno5--;
                }
                else if(deno5>=3) {
                    deno5-=3;
                }
                else return false;
            }
        }
        // if(deno5<0 || deno10<0) return false;
        return true;
    }
}