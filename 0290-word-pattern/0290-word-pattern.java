class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] pattArr = pattern.toCharArray();
    
        String[] sArr = s.split(" ");

        System.out.println(Arrays.toString(sArr));

        if(sArr.length != pattArr.length){
            return false;
        }
        
        StringBuilder sb = new StringBuilder();
        Map<Character,String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for(int i = 0;i<pattArr.length;i++){
            if(!charToWord.containsKey(pattArr[i])){
                
                charToWord.put(pattArr[i],sArr[i]);
            }
            if (!wordToChar.containsKey(sArr[i])) {
                wordToChar.put(sArr[i], pattArr[i]);
            }
            if (!charToWord.get( pattArr[i]).equals(sArr[i]) || !wordToChar.get(sArr[i]).equals(pattArr[i])) {
                return false;
            }

        }
        return true;
     
      
        
    }
}