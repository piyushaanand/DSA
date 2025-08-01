class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new A());
        List<List<Integer>> res = new ArrayList<>();
        int n = intervals.length;
        for(int i = 0 ; i < n ; i++){
            if(res.isEmpty() || res.get(res.size()-1).get(1) < intervals[i][0]){
                res.add(Arrays.asList(intervals[i][0] , intervals[i][1]));
            }else{
                res.get(res.size()-1).set(1, Math.max(res.get(res.size()-1).get(1), intervals[i][1]));
            }
        }
        n = res.size();
        int m = res.get(0).size();
        int ans[][] = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                ans[i][j] = res.get(i).get(j);
            }
        }
        return ans;
    }
    public class A implements Comparator<int []>{
        @Override
        public int compare(int a[], int b[]){
            return a[0] - b[0];
        }
    }
}