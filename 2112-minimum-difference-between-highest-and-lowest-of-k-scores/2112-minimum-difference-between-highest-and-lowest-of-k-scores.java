class Solution {
    public int minimumDifference(int[] nums, int k) {

        if(nums.length == 1){
            return 0;
        }

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int i = 0;
        int j = k-1;

        while(j<nums.length){
            minDiff = Math.min(minDiff, nums[j] - nums[i]);
            i++;
            j++;
        }
        return minDiff;
    }
}
/**
TC :
Sorting: O(n log n)
iteration : O(n)
Total time complexity : O(n log n)

SC: O(1)
 */