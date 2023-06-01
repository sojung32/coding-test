class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0, index2 = 0;
        for(int i=0;i<goal.length;i++){
            String word1 = index1 < cards1.length ? cards1[index1] : "";
            String word2 = index2 < cards2.length ? cards2[index2] : "";
            
            if(!goal[i].equals(word1) && !goal[i].equals(word2)) {
                return "No";
            } else if(goal[i].equals(word1)) {
                index1++;
            } else if(goal[i].equals(word2)) {
                index2++;
            }
        }
        
        return "Yes";
    }
}
