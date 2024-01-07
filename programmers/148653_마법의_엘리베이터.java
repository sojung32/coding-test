class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0) {
            // 일의 자리 수가 5보다 크면 10의 자리수 넘겨서 계산
            // ex. 일의 자리 수가 6이면 10층 한번, 1층 4번 (10 - 4)
            //     일의 자리 수가 3이면 1층 3번
            answer += storey % 10 > 5 ? 10 - storey % 10 : storey % 10;

            // 일의 자리 수가 5일때 10의 자리수가 5보다 작으면 버림 아니면 반올림
            // ex. 숫자가 15일때 다음 수 = 1 (10 + 5 -> 6번)
            //     숫자가 65일때 다음 수 = 7 (100 - 30 - 5 -> 8번)
            if(storey % 10 == 5 && storey / 10 % 10 < 5) {
                storey = storey / 10;
            } else {
                storey = (int) Math.round(storey / 10.0);
            }
        }
        
        return answer;
    }
}