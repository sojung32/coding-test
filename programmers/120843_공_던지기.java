class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        answer = ((2 * k) - 1) % numbers.length;
        if(answer == 0) {
            answer = numbers.length;
        }
        
        return answer;
    }
}