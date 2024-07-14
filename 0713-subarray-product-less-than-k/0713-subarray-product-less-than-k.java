class Solution {
    /**
     * sliding window(two pointer approach):
     * start = 0 and end = 0
     * we will iterate over the nums array with end pointer & keep calculating the
     * product. At the same time we will keep checking if the product exceeds the
     * k value. Now when it exceeds the k value we will start removing the values
     * pointed by the start pointer and keep on increasing the start pointer.
     * 
     * To calculate the total number of subarrays that has value less than k
     * i will also keep a count variable that will count+ = end-start + 1
     * 
     * tc: o(n), n: number of elements in an array
     * sp: o(1), no extra space is used.
     * 
     */

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1)
            return 0; // No valid subarray if k <= 1

        int start = 0;

        int product = 1;
        int count = 0;

        for (int end = 0; end < nums.length; end++) {
            product *= nums[end];

            while (product >= k) {
                product /= nums[start]; // Remove the element at the start pointer from the product
                start++; // Move the start pointer to the right
            }
            count += end - start + 1;
        }
        return count;

    }
}