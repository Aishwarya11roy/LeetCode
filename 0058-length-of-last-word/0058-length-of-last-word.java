class Solution {
    public int lengthOfLastWord(String s) {

        List<String> splitword = Arrays.asList(s.split(" "));
        int len = 0;
        String lastelement = "";
        for(int i = 0;i<splitword.size();i++){
            if(i == splitword.size()-1){
                lastelement = splitword.get(splitword.size()-1);
                len = lastelement.length();
                return len;  
            }
            

        }
        return 0 ;
        
    }
}