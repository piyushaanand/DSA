class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0, candidates, target, res, l);
        return res;
    }
    public void helper(int start, int[] candidates, int target, List<List<Integer>> res, List<Integer> l){
        if(target == 0){
            res.add(new ArrayList<>(l));
        }
        if(target < 0){
            return;
        }
        for(int i = start ; i < candidates.length ; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            l.add(candidates[i]);
            helper(i+1, candidates, target-candidates[i], res, l);
            l.remove(l.size()-1);
        }
    }
}