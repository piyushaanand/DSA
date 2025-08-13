class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        helper(1, res, ans, n, k);
        return res;
    }
    public void helper(int idx, List<List<Integer>> res, List<Integer> ans, int n, int k){
        if(ans.size() == k){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i = idx ; i <= n ; i++){
            ans.add(i);
            helper(i+1, res, ans, n, k);
            ans.remove(ans.size()-1);
        }
    }
}