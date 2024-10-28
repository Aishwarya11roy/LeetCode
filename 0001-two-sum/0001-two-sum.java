class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] arr = new int[2];
        for(int i = 0; i< nums.length;i++){
            if(map.containsKey(target - nums[i])){
                arr[0] = map.get(target-nums[i]);
                arr[1] = i;
            }else{
                map.put(nums[i] , i);
            }
        }
        return arr;
        
    }
}
/**
Space Complexity
HashMap Storage (O(n)):

In the worst case, if no two numbers add up to the target, we may end up storing each element of nums in the map. This would require O(n) space.
Result Array:

The result array (arr) has a fixed size of 2, so it requires O(1) space.
 */