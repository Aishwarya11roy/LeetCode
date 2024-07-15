class Solution {
    public int subarraySum(int[] nums, int k) {
        /**
        will use prefix sum technique here 
        prefix sum array - represents sum of all the elements upto that index in the array
         */

         Map<Integer , Integer>map = new HashMap<>();
         int prefixSum = 0;
         int totalSubArray = 0;
         map.put(0,1); // when you find that prefixSum - k == 0 then you will increase the totalSubarray as it is keeping the check of number of subarray that would sum upto k

         for(int i = 0;i< nums.length;i++){
            prefixSum+= nums[i];
             if(map.containsKey(prefixSum - k) ){
                totalSubArray +=  map.get(prefixSum - k);
             }
             map.put(prefixSum ,map.getOrDefault(prefixSum, 0) + 1);
            
         }
         return totalSubArray;


        
        
    }
}