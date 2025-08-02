class Solution {
    public int findDuplicate(int[] nums) {
        //Bruteforce
        // Set<Integer> set = new HashSet<>();
        // for(int i : nums){
        //     if(set.contains(i)){
        //         return i;
        //     }else{
        //         set.add(i);
        //     }
        // }
        // return -1;

        //Optimal
        int slow = nums[0];
        int fast = nums[0];
        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];
            if(slow == fast){
                break;
            }
        }
        int slow2 = nums[0];
        while(slow != slow2){
            slow = nums[slow];
            slow2 = nums[slow2];
        }
        return slow;
    }
}