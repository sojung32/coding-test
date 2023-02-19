import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> limit = new ArrayList<>();
        
        for(int i=0;i<score.length;i++){
            if(limit.size() < k){
                limit.add(score[i]);
            } else {
                if(Collections.min(limit) < score[i]){
                    limit.set(limit.indexOf(Collections.min(limit)), score[i]);
                }
            }
            answer[i] = Collections.min(limit);
        }
        
        return answer;
    }
}