class Solution {
    public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("[-0-9]+\\s[Z]{1}", "").trim();
        
        if(s.length() > 0){
            String strArr[] = s.split("\\s+");
            for(int i=0;i<strArr.length;i++){
                answer += Integer.parseInt(strArr[i]);
            }
        }
        
        return answer;
    }
}