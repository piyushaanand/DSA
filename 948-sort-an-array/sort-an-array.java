class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    public void mergeSort(int arr[], int low, int high){
        if(low >= high) return;
        else{        
        int mid = low + ( high - low )/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
        }
    }
    public void merge(int arr[], int low, int mid, int high){
        List<Integer> res = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] < arr[right]){
                res.add(arr[left]);
                left++;
            }else{
                res.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            res.add(arr[left]);
            left++;
        }
        while(right <= high){
            res.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = res.get(i-low);
        }
    }
}