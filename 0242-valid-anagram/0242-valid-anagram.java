import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they can't be anagrams
        }
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Decrease counts based on the second string
        for (char c : t.toCharArray()) {
            // If character not found or count reaches zero, they are not anagrams
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            }
            charCountMap.put(c, charCountMap.get(c) - 1);
        }

        // No need for additional checks since counts won't be negative
        return true; // All counts balanced correctly, so the strings are anagrams
    }
}
