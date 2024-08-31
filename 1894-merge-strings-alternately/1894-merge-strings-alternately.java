class Solution {
    public String mergeAlternately(String word1, String word2) {

        char[] word1ChToArr = word1.toCharArray();
        char[] word2ChToArr = word2.toCharArray();
        int totalLength = word1ChToArr.length + word2ChToArr.length;
        char[] mergedArr = new char[totalLength];

        int index1 = 0; // index for word1
        int index2 = 0; // index for word2
        int i = 0; // index for mergedArr

        // Merge characters from both words alternately
        while (index1 < word1.length() && index2 < word2.length()) {
            mergedArr[i++] = word1ChToArr[index1++];
            mergedArr[i++] = word2ChToArr[index2++];
        }

        // If any characters are left in word1
        while (index1 < word1.length()) {
            mergedArr[i++] = word1ChToArr[index1++];
        }

        // If any characters are left in word2
        while (index2 < word2.length()) {
            mergedArr[i++] = word2ChToArr[index2++];
        }

        // Convert the merged array to a string
        return new String(mergedArr, 0, i);
    }
}
