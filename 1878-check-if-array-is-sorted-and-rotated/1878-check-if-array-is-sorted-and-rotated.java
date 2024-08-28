class Solution {
    public boolean check(int[] nums) {
        int oddway = 0;
        int leng = nums.length;
        for(int i = 0;i< leng;i++){
            if(nums[i] > nums[(i+1) % leng])
            oddway++;
        }
        return oddway > 1?false:true;

        
    }
}