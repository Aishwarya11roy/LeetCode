class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> stack = new Stack<>();
        Map<Integer , Integer> map = new HashMap<>();
        /**
        1st we need to iterate over the nums2 and for each element in the nums2 array we need to find the next greater element and need to put this in the map
         */
        for(int n : nums2){
            while(!stack.isEmpty() && n>stack.peek()){
                map.put(stack.pop(), n);

            }
            stack.push(n);
        }
        // iterate over the nums1 and check in the map if it exist just get the map's value for the next greater element otherwise just return -1
        for(int i = 0;i<nums1.length;i++){
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
         return nums1;

    }
         
}