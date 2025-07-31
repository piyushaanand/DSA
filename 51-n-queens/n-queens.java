class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char [][]board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        helper(board, 0, n, res);
        return res;
    }
    public void helper(char[][] board, int row, int n , List<List<String>> res){
        if(row == n){
            List<String> l = new ArrayList<>();
            for(char[] ch : board){
                l.add(new String(ch));
            }
            res.add(l);
            return;
        }
        for(int j = 0 ; j < n ; j++){
            if(isSafe(board, row, j, n)){
                board[row][j] = 'Q';
                helper(board, row+1, n, res);
                board[row][j] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board, int row, int col, int n){
        //Column and Rows
        for(int i = 0 ; i < n ; i++){
            if(board[row][i] == 'Q' || board[i][col] == 'Q'){
                return false;
            }
        }
        //Top left diagonal
        for(int i = row, j = col; i >= 0 && j >= 0 ; i--,j--){
            if(board[i][j] == 'Q') return false;
        }
        //Top right diagonal
        for(int i = row, j = col ; i >= 0 && j < n ; i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
}