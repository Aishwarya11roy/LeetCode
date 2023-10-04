class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);   
            }
        }
        List<Map.Entry <Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1 , o2)->{
            int cmp = o2.getValue().compareTo(o1.getValue());
           return (cmp == 0) ? o1.getKey().compareTo(o2.getKey()) : cmp;
        });
        int result[] = new int[k];
        for (int i = 0; i < k && i < list.size(); i++) {
            result[i] = list.get(i).getKey();
        }
        return result;

        
    }
}