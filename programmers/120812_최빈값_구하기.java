import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        int maxVal = list.get(0);
        int maxCnt = Collections.frequency(list, list.get(0));
        answer = list.get(0);
        for(int i=1;i<list.size();i++){
            if(maxCnt < Collections.frequency(list, list.get(i))){
                maxVal = list.get(i);
                maxCnt = Collections.frequency(list, list.get(i));
                answer = list.get(i);
            } else if(maxCnt == Collections.frequency(list, list.get(i)) && maxVal != list.get(i)){
                answer = -1;
            }
        }
        
        return answer;
    }
}