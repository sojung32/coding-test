import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("^[x]", "").split("[x]+");
        Arrays.sort(answer);
        return answer;
    }
}