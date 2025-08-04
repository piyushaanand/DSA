class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            int mid = i + (j-i)/2;
            if((mid == 0 || nums[mid] != nums[mid-1]) && (mid == nums.length-1 || nums[mid] != nums[mid+1])){
                return nums[mid];
            }
            if(mid > 0 && nums[mid] == nums[mid-1]){
                if(mid % 2 == 1){
                    i = mid + 1;
                }else{
                    j = mid - 2;
                }
            }else{
                if(mid % 2 == 0){
                    i = mid + 2;
                }else{
                    j = mid - 1;
                }
            }
        }
        return -1;
    }
}