class Solution {
    public String[] solution(String[] strArr) {
        int count = 0;
        for(String str : strArr) {
            if(!str.contains("ad")) {
                count++;
            }
        }
        
        String[] answer = new String[count];
        int index = 0;
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")) {
                answer[index++] = strArr[i];
            }
        }
        return answer;
    }
}