class Solution {
    /*
    Intuition :
    one vowel will contribute to the multiple substring.
    Suppose if a vowel is at index i it would contribute to all the substrings
    that start from j to i.(0<= j <=i)
    word = "aba";
    j = 0
    ch = 'a'
    vowel contribution = 1
    Cumulative Contribution (prev): 1 (sum of contributions up to this point)
    Total Sum (res): 1 (total sum of contributions up to this point)
    and so on!

    */
    public long countVowels(String word) {
        long result = 0;
        long prevContri = 0;


        for(int i = 0;i<word.length();i++){
            char c = word.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                prevContri += i+1;
            }
            result += prevContri;

        }
        return result;
        
    }
}