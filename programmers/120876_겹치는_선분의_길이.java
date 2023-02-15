class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int horizon[] = new int[200];
        
        for(int i=0;i<lines.length;i++){
            for(int j=lines[i][0];j<lines[i][1];j++){
                horizon[j+100]++;
            }
        }
        
        for(int i=0;i<horizon.length;i++){
            if(horizon[i] > 1){
                answer++;
            }
        }
        
        return answer;
    }
}