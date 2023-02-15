class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int min1 = common[1] - common[0];
        int min2 = common[2] - common[1];
        double div1 = common[1] / (double) common[0];
        double div2 = common[2] / (double) common[1];
        
        if(min1 == min2){
            answer = common[common.length - 1] + min1;
        } else if(div1 == div2){
            answer = common[common.length - 1] * (int) div1;
        }
        
        return answer;
    }
}