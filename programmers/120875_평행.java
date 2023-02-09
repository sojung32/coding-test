class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for(int i=1;i<4;i++){
            double line1 = (dots[0][0] - dots[i][0]) / (double)(dots[0][1] - dots[i][1]);
            double line2 = (dots[i%3+1][0] - dots[(i+1)%3+1][0]) / (double)(dots[i%3+1][1] - dots[(i+1)%3+1][1]);
            
            if(line1 == line2){
                answer = 1;
                break;
            }
        }
        
        
        return answer;
    }
}