class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = countFirst(nums, target);
        ans[1] = countLast(nums, target);
        return ans;
    }
    public int countFirst(int nums[], int target){
        int i = 0, j = nums.length - 1, idx = -1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] == target){
                idx = mid;
                j = mid - 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return idx;
    }
    public int countLast(int nums[], int target){
        int i = 0, j = nums.length - 1, idx = -1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(nums[mid] == target){
                idx = mid;
                i = mid + 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return idx;
    }
}