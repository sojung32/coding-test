class Solution {
    public int solution(int[] num_list) {
        int mult = 1;
        int sum = 0;
        
        for(int num : num_list) {
            mult *= num;
            sum += num;
        }
        
        return mult < Math.pow(sum, 2) ? 1 : 0;
    }
}