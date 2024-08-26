class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i  = 0; i< nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1 );
            }else{
                map.put(nums[i] , 1);
            }
        }
        for(int i = 1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        int len = list.size();

        int arr[] = new int[len];
        for(int i = 0;i<list.size();i++){
            arr[i] = list.get(i);
        }
        return list;
        
    }
}