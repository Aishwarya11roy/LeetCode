class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer>map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }
        List <Integer> list = new ArrayList<>(map.keySet());
        System.out.println(list);
        list.sort((a,b) -> map.get(b) -  map.get(a));
        int [] result = new int[k];
        for(int i = 0;i<k;i++){
            result[i] = list.get(i);
        }
        return result;

    }
}