class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        //Optimal Approach
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while(m <= h){
            if(nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else{
                swap(nums, m, h);
                h--;
            }
        }
        //Bruteforce Approach
        // int count0 = 0;
        // int count1 = 0;
        // int count2 = 0;
        // for(int i : nums){
        //     if(i == 0) count0++;
        //     else if(i == 1) count1++;
        //     else if(i == 2) count2++;
        // }
        // int i = 0;
        // while(count0 > 0){
        //     nums[i++] = 0;
        //     count0--;
        // }
        // while(count1 > 0){
        //     nums[i++] = 1;
        //     count1--;
        // }
        // while(count2 > 0){
        //     nums[i++] = 2;
        //     count2--;
        // }
    }
}