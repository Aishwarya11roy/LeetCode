class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Handle cases where k is greater than n
        int [] arr = new int [n];
        
        for(int i = n-k, j=0; i<n; i++, j++){
            arr[j] = nums[i];
        }
        for(int i = 0, j=k; i<n-k; i++, j++){
            arr[j] = nums[i];
        }
        for(int i = 0;i<n;i++){
            nums[i] = arr[i];
        }
        
    }
}
