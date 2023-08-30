class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<delete_list.length;j++){
                if(arr[i] == delete_list[j]) {
                    count++;
                }
            }
        }
        
        int[] answer = new int[arr.length - count];
        
        int index = 0;
        for(int i=0;i<arr.length;i++){
            boolean isEqual = false;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i] == delete_list[j]) {
                    isEqual = true;
                }
            }
            if(!isEqual) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}