class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize a variable to keep track of the final length of the
        // modified array
        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if((k < 2) || (nums[i] != nums[k-2])){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}