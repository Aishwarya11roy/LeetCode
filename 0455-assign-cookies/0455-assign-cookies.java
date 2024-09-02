class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        for(int i = 0; i<s.length && gIndex < g.length; i++){
            if(s[i] >= g[gIndex]){
                gIndex++;
                count++;
            }
        }



      
        return count;
        
    }
}