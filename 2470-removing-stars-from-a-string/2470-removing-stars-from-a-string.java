class Solution {
    public String removeStars(String s) {
        StringBuilder finalString = new StringBuilder();
        finalString.append(s.charAt(0));

        for(int i = 1; i< s.length();i++){
            if(s.charAt(i) == '*'){
               // Remove the last character from finalString
                // Only if there is a character to remove
                if (finalString.length() > 0) {
                    finalString.deleteCharAt(finalString.length() - 1);
                }
            }else{
               finalString.append(s.charAt(i));
            }
           
        }
        return finalString.toString();

        
    }
}