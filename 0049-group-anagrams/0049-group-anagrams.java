class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> resultList =  new ArrayList<>();
        // Map<String,ArrayList<String>> map = new HashMap<>();
         Map<String, List<String>> map = new HashMap<>();
        for(String s :strs){
            char []charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedArrayStr =  String.valueOf(charArray);
            if(!map.containsKey(sortedArrayStr)){
                map.put(sortedArrayStr ,new ArrayList<>());
            }
          
            map.get(sortedArrayStr).add(s);
            

        }
        return new ArrayList<>(map.values());
        
    }
}