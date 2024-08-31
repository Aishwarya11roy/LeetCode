class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder merged = new StringBuilder();
        int index = 0;
        while(index < word1.length() || index < word2.length()){
            if(index < word1.length()){
                merged.append(word1.charAt(index));
            }
            if(index < word2.length()){
                merged.append(word2.charAt(index));
            }
            index++;
        }
        return merged.toString();
    }
}
