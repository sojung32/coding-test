import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<intStrs.length;i++){
            int part = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(part > k) {
                result.add(part);
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}