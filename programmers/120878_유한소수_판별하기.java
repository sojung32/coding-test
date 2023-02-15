class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        while(b%2==0){
            b /= 2;
        }
        while(b%5==0){
            b /= 5;
        }
        if(b > 1 && a % b != 0){
            answer = 2;
        }
        
        return answer;
    }
}