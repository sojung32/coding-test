class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int answer_len = 0;
        int start_index = 0, end_index = 0, gap = 1;
        switch(n) {
            case 1:
                answer_len = slicer[1] + 1;
                start_index = 0;
                end_index = slicer[1];
                gap = 1;
                break;
            case 2:
                answer_len = num_list.length - slicer[0];
                start_index = slicer[0];
                end_index = num_list.length - 1;
                gap = 1;
                break;
            case 3:
                answer_len = slicer[1] - slicer[0] + 1;
                start_index = slicer[0];
                end_index = slicer[1];
                gap = 1;
                break;
            case 4:
                answer_len = (int) ((slicer[1] - slicer[0]) / slicer[2]) + 1;
                start_index = slicer[0];
                end_index = slicer[1];
                gap = slicer[2];
        }
        
        int[] answer = new int[answer_len];
        for(int i=0;i<answer.length;i++) {
            answer[i] = num_list[start_index];
            start_index += gap;
        }
        
        return answer;
    }
}