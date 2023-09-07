class Solution {
    public boolean canPermutePalindrome(String s) {

        int [] arrcount = new int[26];
         s = s.toLowerCase();

        for(char c : s.toCharArray()){
            int index = c-'a';
            arrcount[index]++;
        }
        int oddcount = 0;

        for(int count : arrcount){
            if(count %2 !=0){
                oddcount++;
            }
        }
        if(oddcount <=1)
        return true;
        else
        return false;

        
    }
}