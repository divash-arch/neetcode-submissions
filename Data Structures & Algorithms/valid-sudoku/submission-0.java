class Solution {
    public boolean isValidSudoku(char[][] board) {
        int [][] row = new int[10][10];
        int [][] col = new int[10][10];
        int [][] box = new int[10][10];

        for(int i = 0;i < 9;i++){
            for(int j = 0;j < 9;j++){
                if(Character.isDigit(board[i][j])){
                    int k = board[i][j] - '0';
                    if(row[i][k] == 1){
                        return false;
                    }
                    if(col[k][j] == 1){
                        return false;
                    }

                    row[i][k] = 1;
                    col[k][j] = 1;
                    int boxNum = (i/3) * 3 + (j/3);
                    if(box[boxNum][k] == 1){
                        return false;
                    }
                    box[boxNum][k] = 1;
                }
            }
        }

        return true;
        
    }
}