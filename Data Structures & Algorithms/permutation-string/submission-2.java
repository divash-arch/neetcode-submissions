class Solution {
    public boolean checkInclusion(String s1, String s2) {


        int l = 0;
        int r = 0;

        int [] freq = new int[26];

        for(int i = 0; i < s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }

        while(l < s2.length() && freq[s2.charAt(l) - 'a'] <=0){
                l++;
        }
        r = l;
        while(l <= r && r < s2.length()){          
            if(freq[s2.charAt(r) - 'a'] > 0){
                freq[s2.charAt(r) - 'a']--;
                r++;
                if(r - l == s1.length()){
                    return true;
                }
            }else{
                if(r - l >= 1){
                    freq[s2.charAt(l) - 'a']++;
                }
                l++;
                if(r <= l){
                    r = l; 
                }
        
            }
        }

        return false;
        
    }
    
}
