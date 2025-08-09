class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(res, ans, nums, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> ans, int nums[], int start){
        res.add(new ArrayList<>(ans));
        for(int i = start ; i < nums.length ; i++){
            ans.add(nums[i]);
            helper(res,ans,nums,i+1);
            ans.remove(ans.size()-1);
        }
    }
}