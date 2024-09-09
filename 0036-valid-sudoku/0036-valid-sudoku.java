class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visited = new HashSet<>();
        for(int i = 0;i<board.length;i++){
            for(int j = 0; j< board[0].length;j++){
                char number = board[i][j];
                if( number != '.'){
                    if( !visited.add( number + "in row" + i) ||
                        !visited.add( number + "in col" + j) ||
                        !visited.add( number + "in black" + i/3 + "-" + j/3 ))
                        return false;
                }
            }
        }
        return true;
        
    }
}