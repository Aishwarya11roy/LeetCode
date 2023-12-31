class Solution {
    public boolean isOneEditDistance(String s, String t) {
    if(s.length() > t.length()){
        return isOneEditDistance(t,s);
    }
    int i  = 0;
    int j = 0;
    while(i < s.length() && j < t.length()){
        if(s.charAt(i) != t.charAt(j)){
        return s.substring(i).equals(t.substring(j + 1)) ||
        s.substring(i + 1).equals(t.substring(j + 1));
        }
        i++;
        j++;
    }
    return (t.length()-j == 1);

    }
}