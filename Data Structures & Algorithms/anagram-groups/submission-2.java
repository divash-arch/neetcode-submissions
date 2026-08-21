class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ans = new ArrayList<>();
        if(strs.length == 0){
            return ans;
        }
        Map<String, List<String>> cand = new HashMap<>();
        cand.put(strs[0], new ArrayList<>());
        cand.get(strs[0]).add(strs[0]);
        for(int i = 1; i < strs.length;i++){
            String k = strs[i];

            int a  = 0;

            for(String key: cand.keySet()){
                    int [] charsCount = new int[27];
                    for(char c : k.toCharArray()){
                        charsCount[c - 'a']++;
                    }
                    if(key.length() == k.length()){
                        a = 1;
                        char[] chars = key.toCharArray();
                        for(char c : chars){
                            if(charsCount[c - 'a'] <= 0){
                                a = 2;
                                break;
                            }
                            charsCount[c - 'a']--;
                        }
                        if(a == 1){
                            cand.get(key).add(k);
                            break;
                        }
                    }
            }
            if(a != 1){
                cand.put(k,new ArrayList<>());
                cand.get(k).add(k);
            }
        }
        for(String key: cand.keySet()){
            ans.add(cand.get(key));
        }
        return ans;
    }
}

