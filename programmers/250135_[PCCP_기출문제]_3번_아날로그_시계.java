class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int time1 = countSeconds(h1, m1, s1);
        int time2 = countSeconds(h2, m2, s2);
        
        int count1 = countMeetings(time1);
        int count2 = countMeetings(time2);
        
        // 시작 시간이 12시 정각인 경우 1번 추가 울림
        return count2 - count1 + (time1 % 43200 == 0 ? 1 : 0);
    }
    
    // 초 계산
    private int countSeconds(int h, int m, int s) {
        return h * 60 * 60 + m * 60 + s;
    }
    
    // 시침 12시간(43200초)에 719번
    // 분침 1시간(3600초)에 59번
    // 12시 정각인 경우 동시에 1번
    private int countMeetings(int time) {
        return (time * 719 / 43200) + (time * 59 / 3600) - (time >= 43200 ? 1 : 0);
    }
}