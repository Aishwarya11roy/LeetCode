class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;// pointer to nums1
        int j = 0;// pointer to nums2
        int n1 = nums1.length;
        int n2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        while(i < n1 & j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums2[j] < nums1[i]){
                j++;
            }else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []arr = new int[list.size()];
        int index = 0;
        for(int x : list){
            arr[index++] = x;
        }

        return arr;
        
    }
}