class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0;i<quiz.length;i++){
            String[] split = quiz[i].split(" ");
            int cal;
            if("+".equals(split[1])){
                cal = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
            } else {
                cal = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
            }
            if(cal == Integer.parseInt(split[4])){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}