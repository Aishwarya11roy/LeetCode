/*
One way to solve this problem is using frequency map so iterate over the array find the freqeucy of each elements in the array. Again in the another loop just iterate over each element of the array and get the frequency and chekc if thefrequency of any element is 1 then we can return that number . But this approach take TC :o(n) & SC : o(n). 

To optimize the code we should use xor (bitwise operator) this will reduce the space complxity as o(1).
*/
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i =0 ;i<nums.length;i++){
            ans ^= nums[i];
        }
        return ans;  
    }
}