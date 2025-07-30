class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        if(nums == null || n < 2){
            return new int[] {-1, -1};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            int val = target - nums[i];
            if(map.containsKey(val)){
                return new int[] {i, map.get(val)};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}