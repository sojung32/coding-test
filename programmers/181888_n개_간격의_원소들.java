class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[(int) Math.ceil(num_list.length/(double) n)];
        
        int index = 0;
        for(int i=0;i<num_list.length;i+=n) {
            answer[index++] = num_list[i];
        }
        
        return answer;
    }
}