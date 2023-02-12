class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int unsafe[][] = new int[board.length][board.length];
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 1){
                    unsafe[i][j] = 1;
                    for(int k=(i >= 1 ? i-1 : i);k<=(i < board.length - 1 ? i+1 : i);k++){
                        for(int l=(j >= 1 ? j-1 : j);l<=(j < board.length - 1 ? j+1 : j);l++){
                            if(board[k][l] == 0){
                                unsafe[k][l] = 1;
                            }
                        }
                    }
                }
            }
        }
        for(int i=0;i<unsafe.length;i++){
            for(int j=0;j<unsafe.length;j++){
                if(unsafe[i][j] == 1){
                    answer++;
                }
            }
        }
        return board.length * board.length - answer;
    }
}