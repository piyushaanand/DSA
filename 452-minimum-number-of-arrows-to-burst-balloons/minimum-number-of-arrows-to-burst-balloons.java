class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length == 1){
            return 1;
        }
        Arrays.sort(points, new A());
        int pointer = points[0][1];
        int ans = 1;
        for(int i = 1 ; i < points.length ; i++){
            if(pointer >= points[i][0]){
                continue;
            }
            pointer = points[i][1];
            ans++;
        }
        return ans;
    }
    public class A implements Comparator<int []>{
        @Override
        public int compare(int a[], int b[]){
            return Integer.compare(a[1], b[1]);
        }
    }
}