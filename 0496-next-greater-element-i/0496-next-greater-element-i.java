class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] finalArr = new int[nums1.length];
        //nums1 = {2,4} nums2 ={1,3,4,2}
        for(int i = 0;i<nums1.length;i++){  //0
            for(int j = 0;j< nums2.length;j++){ //0
                if(nums1[i] == nums2[j]){ // 2&1, 2&3 , 2&4, 2&2
                    finalArr[i] = findNextGreater(nums2, j);
                }
            }

        }
        return finalArr;
        
    }
    private static int findNextGreater(int []nums2, int j){
        int right = j+1; //4+1 = 5

        while(right <nums2.length){
            if(nums2[j] < nums2[right]){
                return nums2[right];
            }
            right++;
        }
        return -1;

    }
}