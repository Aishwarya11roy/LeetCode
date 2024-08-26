class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /**
        1. Iterate over the nums array. Fing the corrrespinding index
        nums[i] - 1 and mark the element at that index as negative. This  
        negative mark indicates that the number nums[i] exists in the array.

        2. // Find indices with positive numbers, these are the missing numbers

         */

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

/**
TC: O(N)
SC: O(1)
 */

        
      
}
