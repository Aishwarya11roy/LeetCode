class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> freqMap = new HashMap<>();
        for(int i = 0;i< words.length;i++){
            freqMap.put(words[i],freqMap.getOrDefault(words[i],0) + 1);
        }
        List<String> res = new ArrayList(freqMap.keySet());
        // sort
        Collections.sort(res, (w1, w2) -> freqMap.get(w1).equals(freqMap.get(w2)) ? w1.compareTo(w2) : freqMap.get(w2) - freqMap.get(w1));

        return res.subList(0, k);
        
    }
}