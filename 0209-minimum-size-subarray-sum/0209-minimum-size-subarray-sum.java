class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int i = 0;
        int minLen =  Integer.MAX_VALUE;
        int j= 0;

        while(j < nums.length){
            sum += nums[j];
            j++;

            while(sum >= target){
                minLen = Math.min(minLen , j-i);
                sum -=nums[i];
                i++;
            }

        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}