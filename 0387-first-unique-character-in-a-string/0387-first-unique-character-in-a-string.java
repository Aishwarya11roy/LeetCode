class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        // Correctly populating the map with character frequencies
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1); // Correctly increment the count
            } else {
                map.put(c, 1);
            }
        }
        // for(int i = 0;i<s.length();i++){
        //         if(map.get(c) == 1)
        //         return i;
            
        // }
        // Checking for the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i; // Return the index of the first unique character
            }
        }
        return -1;  
    }
}