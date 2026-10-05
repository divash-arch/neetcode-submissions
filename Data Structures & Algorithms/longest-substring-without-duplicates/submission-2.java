class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }
        Map<Character, Integer> lastPos = new HashMap();
        int l = 0;
        int r = 1;
        lastPos.put(s.charAt(l), l);
        int ans = 0;
        while(r < s.length()){
            if(lastPos.get(s.charAt(r)) != null && lastPos.get(s.charAt(r)) >= l){
                l = lastPos.get(s.charAt(r)) + 1;
            }
            lastPos.put(s.charAt(r), r);

            ans = Math.max(ans, r - l);
            r++;
        }
        return ans+1;
        
    }
}
