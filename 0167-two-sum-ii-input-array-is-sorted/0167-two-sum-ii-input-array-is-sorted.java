class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        Map<Integer , Integer> map = new  HashMap<>();
        for(int i  = 0;i<numbers.length;i++){
            if(map.containsKey(target - numbers[i])){
                result[1] = i+1;
                result[0] = map.get((target - numbers[i])) + 1;
                break;
            }
            map.put(numbers[i],i);
        }

        return result;
    }
}