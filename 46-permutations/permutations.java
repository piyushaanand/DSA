class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        helper(res, ans, used, nums);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> ans, boolean []used, int nums[]){
        if(ans.size() == nums.length){
            res.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(!used[i]){
                used[i] = true;
                ans.add(nums[i]);
                helper(res, ans, used, nums);
                used[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }
}