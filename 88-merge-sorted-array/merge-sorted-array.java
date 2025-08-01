class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Approach - 1
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        //Approach 2
        // int i = m-1;
        // int j = 0;
        // while(i>=0 && j<n){
        //     if(nums1[i]>nums2[j]){
        //         int temp = nums1[i];
        //         nums1[i] = nums2[j];
        //         nums2[j] = temp;
        //         i--;
        //         j++;
        //     }else{
        //         break;
        //     }
        // }
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);

    }
}