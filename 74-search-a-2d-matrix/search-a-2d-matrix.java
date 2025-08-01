class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        //Optimal Approach
        int i = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int j = n*m-1;
        while(i <= j){
            int mid = i + (j - i)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return false;
        //Bruteforce Approach ---> Time Complexity (O(NxM))
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length ; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        //Optimal Approach ----> (O(log2(NxM)))
    //     int n = nums.length;
    //     int m = nums[0].length;
    //     return helper(nums, target, 0, (n*m)-1, m);
        
    // }
    // public boolean helper(int [][]nums, int target, int low, int high, int m){
    //     while(low<=high){
    //         int mid = (high+low)/2;
    //         int row = mid/m;
    //         int col = mid%m;
    //         if(nums[row][col] == target) return true;
    //         else if(nums[row][col] > target){
    //             return helper(nums, target, low, mid-1, m);
    //         }else{
    //             return helper(nums, target, mid+1, high, m);
    //         }
    //     }
    //     return false;
    }
}