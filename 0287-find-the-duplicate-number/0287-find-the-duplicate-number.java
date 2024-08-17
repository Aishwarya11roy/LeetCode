class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> visitedSet = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(visitedSet.contains(nums[i])){
                return nums[i];
            }
            visitedSet.add(nums[i]);
        }
        return -1;
        

    }
}
/**
Time Complexity: O(n) because we iterate through the array once.
Space Complexity: O(n) for storing the set.
 */