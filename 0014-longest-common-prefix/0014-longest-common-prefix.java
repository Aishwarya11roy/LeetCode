class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String resultString = "";
        int idx = 0;
        int len = strs[0].length();

        while( idx < len){
            if(strs[0].charAt(idx) == strs[strs.length-1].charAt(idx)){
                resultString = resultString + strs[0].charAt(idx);
            }else{
                break;
            }
            idx++;
        }
        return resultString;




        
    }
}

/**
time complexity : nlogn - sorting
+ o(m) : m being the length of the smallest string

space complexity : o(1)
 */