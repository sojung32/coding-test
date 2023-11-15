import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = my_string;
        
        Arrays.sort(indices);
        
        for(int i=indices.length-1;i>=0;i--){
            answer = answer.substring(0, indices[i]) + answer.substring(indices[i] + 1);
        }
        
        return answer;
    }
}