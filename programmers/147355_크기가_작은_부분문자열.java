class Solution {
    public int solution(String t, String p) {
        int answer = t.length()-p.length()+1;
        
        for(int i=0;i<t.length()-p.length()+1;i++){
            String tPart = t.substring(i, i + p.length());
            for(int j=0;j<p.length();j++){
                if(Integer.parseInt(tPart.substring(j, j+1)) > Integer.parseInt(p.substring(j, j+1))){
                    answer--;
                    break;
                } else if(Integer.parseInt(tPart.substring(j, j+1)) < Integer.parseInt(p.substring(j, j+1))){
                    break;
                }
            }
        }
        
        return answer;
    }
}