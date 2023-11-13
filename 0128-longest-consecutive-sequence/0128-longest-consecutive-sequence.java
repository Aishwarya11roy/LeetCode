class Solution {
    public int longestConsecutive(int[] nums) {
       int longestConsLen = 0;
       Map<Integer, Boolean> map = new HashMap<>();
       for(int num : nums){
           map.put(num,Boolean.FALSE);
       } 
        for(int num : nums){
            int currLen = 1;
            // check the consecutive numbers in forward direction
            int nextNum = num + 1;
            while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currLen++;
                map.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            // check the consecutive numbers in backward direction
             nextNum = num - 1;
             while(map.containsKey(nextNum) && map.get(nextNum) == false){
                currLen++;
                map.put(nextNum,Boolean.TRUE);
                nextNum--;
            }
            longestConsLen = Math.max(longestConsLen ,currLen);
        } 
        return longestConsLen;
    }
}