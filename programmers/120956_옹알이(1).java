class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0;i<babbling.length;i++){
            if(babbling[i].replaceAll("aya|ye|woo|ma", "").length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}