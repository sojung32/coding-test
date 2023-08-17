class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        
        boolean even = arr.length % 2 == 0 ? true : false;
        for(int i=0;i<arr.length;i++){
            if((even && i % 2 == 1) || (!even && i % 2 == 0)) {
                answer[i] += n;
            }
        }
        
        return answer;
    }
}