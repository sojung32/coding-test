class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] calc = binomial.split(" ");
        switch(calc[1]) {
            case "+":
                answer = Integer.parseInt(calc[0]) + Integer.parseInt(calc[2]);
                break;
            case "-":
                answer = Integer.parseInt(calc[0]) - Integer.parseInt(calc[2]);
                break;
            case "*":
                answer = Integer.parseInt(calc[0]) * Integer.parseInt(calc[2]);
                break;
        }
        
        return answer;
    }
}