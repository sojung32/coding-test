package programmers;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int unknown = 0;
        int constant = 0;
        
        String split[] = polynomial.split("[+]");
        
        for(int i=0;i<split.length;i++){
            String str = split[i].trim();
            if(str.indexOf("x") > -1){
                str = str.substring(0, str.length() - 1);
                unknown += "".equals(str) ? 1 : Integer.parseInt(str);
            } else {
                constant += Integer.parseInt(str);
            }
        }
        
        if(unknown > 0) {
            answer += unknown > 1 ? unknown + "x" : unknown == 1 ? "x" : "";
            answer += constant > 0 ? " + " + constant : "";
        } else {
            answer += constant + "";
        }
        
        return answer;
    }
}