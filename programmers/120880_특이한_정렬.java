class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = {};
        
        for(int i=0;i<numlist.length;i++){
            int num = 0;
            int minus = 99999;
            int index = 0;
            for(int j=i;j<numlist.length;j++){
                if(minus > Math.abs(n - numlist[j]) || (minus == Math.abs(n - numlist[j]) && num < numlist[j])){
                    num = numlist[j];
                    minus = Math.abs(n - numlist[j]);
                    index = j;
                }
            }
            if(numlist[i] != num){
                int temp = numlist[i];
                numlist[i] = numlist[index];
                numlist[index] = temp;
            }
        }
        
        return numlist;
    }
}