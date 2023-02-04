class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        int min = balls - share > share ? share : balls - share;
        
        if(balls != share){
            for(int i=0;i<min;i++){
                answer *= (balls - i);
                answer /= (i + 1);
            }
        }
        
        return answer;
    }
}