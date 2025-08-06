class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        int j = 0;
        int num[] = new int[nums1.length + nums2.length];
        for(int n : nums1){
            num[j] = n;
            j++;
        }
        for(int n : nums2){
            num[j] = n;
            j++;
        }
        Arrays.sort(num);
        int n = num.length;
        if (n%2==0) return (float)(num[n/2-1] + num[n/2])/2;
        else return num[n/2];
    }
}