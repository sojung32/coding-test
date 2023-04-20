class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int result = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int compare = 2 * a * b;
        
        return result >= compare ? result : compare;
    }
}
