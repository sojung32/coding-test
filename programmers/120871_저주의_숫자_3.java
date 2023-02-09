class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            answer++;
            
            while(answer % 3 == 0 || Integer.toString(answer).indexOf("3") > -1){
                answer++;
            }
        }
        
        return answer;
    }
}