class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Integer> x = new HashMap<>();
        HashMap<Character, Integer> y = new HashMap<>();
        for(int i=0;i<s.length();i++){
            x.put(s.charAt(i),x.getOrDefault(s.charAt(i),0)+1);
            y.put(t.charAt(i),y.getOrDefault(t.charAt(i),0)+1);
        }
    return x.equals(y);
    }
}