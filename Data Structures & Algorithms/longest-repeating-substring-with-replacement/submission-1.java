class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int r = l + 1;
        int [] freq = new int[26];
        freq[s.charAt(l) - 'A']++;
        int ans = 1;
        while(l < r && r < s.length()){
            freq[s.charAt(r) - 'A']++;
            int currentRepl = (r - l) + 1 - findMax(freq);
            while(currentRepl > k){
                freq[s.charAt(l) - 'A']--;
                l++;
                currentRepl = (r - l) + 1 - findMax(freq);  
            }
            ans = Math.max(ans, (r - l)+1);
            r++;
        }
        return ans;
        
    }

    int findMax(int [] freq){
        int ans = 0;
        for(int i = 0; i < 26;i++){
            if(freq[i] > ans){
                ans = freq[i];
            }
        }

        return ans;
    }
}
