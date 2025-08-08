class Solution {
    public boolean checkValidGrid(int[][] grid) {
        return helper(grid, 0,0,0);
    }
    public boolean helper(int [][]grid, int val, int row, int col){
        if(val == grid.length * grid.length){
            return true;
        }
        if(row >= 0 && row < grid.length && col >= 0 && col < grid.length && grid[row][col] == val){
            return helper(grid, val+1, row-1, col-2) || helper(grid, val+1, row-1, col+2) 
                   || helper(grid, val+1, row-2, col-1) || helper(grid, val+1, row-2, col+1)
                   || helper(grid, val+1, row+1, col-2) || helper(grid, val+1, row+1, col+2)
                   || helper(grid, val+1, row+2, col-1) || helper(grid, val+1, row+2, col+1);
        }else{
            return false;
        }
    }
}