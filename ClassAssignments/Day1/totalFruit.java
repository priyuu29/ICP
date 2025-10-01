import java.util.HashMap;
import java.util.Map;
class totalFruit {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < fruits.length; right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);//window grow hori h

           if(map.size()>2){
                map.put(fruits[left], map.get(fruits[left])-1);// yha pr shrink
                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            if(map.size()<=2){
                 maxLen = Math.max(maxLen, right - left + 1);//4-3+1=2

            }
        }

        return maxLen;
    }
}
