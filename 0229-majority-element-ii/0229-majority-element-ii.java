class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        int maxValue = len /3;


        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
        }

        for(Integer num:map.keySet()){
            if(map.get(num)> maxValue){
                   list.add(num);
                }
        }
        
        return list;
    }
}