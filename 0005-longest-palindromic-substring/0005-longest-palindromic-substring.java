class Solution {
    public String longestPalindrome(String s) {

         if (s.length() <= 1) {
                return s;
            }
      
        String maxPal = s.substring(0,1);

        for(int i = 0;i<s.length()-1;i++){
            String odd = expandcenter(s,i,i);
            String even = expandcenter(s,i,i+1);

            if(odd.length() > maxPal.length()){
                maxPal = odd;
            }
            if(even.length() > maxPal.length()){
                maxPal = even;
            }

        }
        return maxPal;
    }

   String expandcenter(String s, int left , int right){
        while(left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)){
            left--;
            right++;
        }
        
        return s.substring(left+1 , right);
    }
}