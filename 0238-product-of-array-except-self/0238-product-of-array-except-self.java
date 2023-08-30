class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int runprod = 1;

        for(int i = 0;i< nums.length;i++){
            res[i] =  runprod;
            runprod = runprod * nums[i];


        }
         runprod = 1;
        for(int i = nums.length -1 ; i >= 0; i--){
            res[i] = res[i] *runprod;
            runprod = runprod * nums[i];

        } 
       return res; 
    }
}