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
/**
Learnings :
1 .  When I tried to convert s = "dog cat cat dog" to character array using toCharArray i was getting sArry = [d,o,g,c,a,t] so i split the s on space

2. used two hashmap because if a- dog b - dog then it will go wrong
we need both the ket to value and value to key pair unique.

 */