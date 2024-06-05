class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        

        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                System.out.println(map);
                map.put(nums[i] , map.get(nums[i]) + 1);
            }else if(!map.containsKey(nums[i])){
                  map.put(nums[i], 1);

            }
          

        }
        System.out.println(map);
        List <Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(a) -  map.get(b));
        System.out.println(list);
        int lastElementIndex = list.size()-1;

        return list.get(lastElementIndex);

    }
}