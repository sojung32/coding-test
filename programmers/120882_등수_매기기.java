class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double compare;
        
        for(int i=0;i<score.length;i++){
            compare = (score[i][0] + score[i][1]) / (double)2;
            answer[i]++;
            for(int j=0;j<score.length;j++){
                if(compare > (score[j][0] + score[j][1]) / (double)2){
                    answer[j]++;
                }
            }
        }
        
        return answer;
    }
}