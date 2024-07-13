class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        Using hashSet i have to detect the unique characters
        calculate the max length of the unique character
        if it a character is repeating , remove that character using left
        pointer . Keep checkingthe unique character lengths.
    
        */

        Set<Character> cset = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0;right < s.length();right++){
            if(!cset.contains(s.charAt(right))){
                cset.add(s.charAt(right));
                maxLen = Math.max(maxLen , right -  left + 1);
            }else{
                while(cset.contains(s.charAt(right))){
                    cset.remove(s.charAt(left));
                    left++;
                }
                cset.add(s.charAt(right));
            }
        }

        return maxLen;
        
    }
}