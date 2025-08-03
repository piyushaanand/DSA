class Solution {
    public int reversePairs(int[] nums) {
        long num[] = new long[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            num[i] = nums[i];
        }
        long res = helper(num, 0, num.length - 1);
        return (int) res;
    }
    public long helper(long []nums, int low, int high){
        long ct = 0;
        if(low >= high) return ct;
        int mid = low + (high - low) / 2;
        ct += helper(nums, low, mid);
        ct += helper(nums, mid + 1, high);
        ct += helper3(nums, low, mid, high);
        helper2(nums, low, mid, high);
        return ct;
    }
    public void helper2(long []nums, int low, int mid, int high){
        List<Long> res = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                res.add(nums[left]);
                left++;
            }else{
                res.add(nums[right]);
                right++;
            }
        }
        while(left <= mid){
            res.add(nums[left]);
            left++;
        }
        while(right <= high){
            res.add(nums[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            nums[i] = res.get(i-low);
        }
    }
    public long helper3(long nums[], int low, int mid, int high){
        long ct = 0;
        int right = mid + 1;
        for(int i = low ; i <= mid ; i++){
            while(right <= high && nums[i] > 2*nums[right]){
                right++;
            }
            ct = ct + (right - (mid + 1));
        }
        return ct;
    }
}