class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        answer[0] = -1;
        for(int i=1;i<s.length();i++){
            if(s.lastIndexOf(s.charAt(i), i-1) > -1) {
                answer[i] = i - s.lastIndexOf(s.charAt(i), i-1);
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}