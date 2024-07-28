class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> minSubSequence = new ArrayList<>();

        Arrays.sort(nums);
        int totalSum = 0;
        for(int num : nums){
            totalSum+= num;
        }

        int currentSum = 0;

        for(int j = nums.length-1;j>=0;j--){
            totalSum -= nums[j];
            currentSum += nums[j];
            minSubSequence.add(nums[j]);
            if(currentSum > totalSum){
                return minSubSequence;
            }
        }
        return minSubSequence;
        
    }
}