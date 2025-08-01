class Solution {
    public int majorityElement(int[] v) {
        //Better Approach
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < n ; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        // }
        // for(Map.Entry<Integer, Integer> num : map.entrySet()){
        //     if(num.getValue() > n/2){
        //         return num.getKey();
        //     }
        // }
        // return -1;

        //Optimal Approach Moore's Voting Algorithm
        int n = v.length;
        int cnt1 = 0;
        int ele = 0;
        for(int i = 0 ; i < n ; i++){
            if(cnt1 == 0){
                cnt1 = cnt1+1;
                ele = v[i];
            }else if(v[i] == ele){
                cnt1++;
            }else{
                cnt1--;
            }
        }
        int cnt2 = 0;
        for(int i = 0 ; i < n ; i++){
            if(v[i] == ele){
                cnt2++;
            }
        }
        if(cnt2 > n/2){
            return ele;
        }else{
            return -1;
        }
    }
}