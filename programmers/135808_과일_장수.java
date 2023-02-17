class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int apple[] = new int[k];
        
        for(int i=0;i<score.length;i++){
            apple[score[i]-1]++;
        }
        
        int appleCnt = 0;
        for(int i=apple.length-1;i>=0;i--){
            appleCnt += apple[i];
            
            while(appleCnt / m > 0){
                answer += (i+1) * m * (appleCnt / m);
                appleCnt = appleCnt % m;
            }
        }
        
        return answer;
    }
}