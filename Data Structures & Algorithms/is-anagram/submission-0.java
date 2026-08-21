class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap();
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        int i = 0;
        while(i < n){
          int k = freq.getOrDefault(s.charAt(i), 0);
          freq.put(s.charAt(i), k+1);
          i++;
        }

        i = 0;
        while(i < n){
            if(freq.get(t.charAt(i)) == null || freq.get(t.charAt(i)) == 0){
                return false;
            }else{
                int k = freq.get(t.charAt(i));
                k--;
                freq.put(t.charAt(i), k);
            }
            i++;
        }
        return true;
    }
}
