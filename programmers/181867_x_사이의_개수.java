class Solution {
    public int[] solution(String myString) {
        int[] answer = new int[myString.replaceAll("[^x]", "").length() + 1];
        
        String[] strSplit = myString.split("x");
        for(int i=0;i<strSplit.length;i++){
            answer[i] = strSplit[i].length();
        }
        
        return answer;
    }
}