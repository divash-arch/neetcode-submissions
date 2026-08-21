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
            boolean done = false;
            for(String key: cand.keySet()){
                if(key.length() == k.length()){
                    char[] chars = key.toCharArray();
                    Arrays.sort(chars);
                    String sorted = new String(chars);
                    char[] chars1 = k.toCharArray();
                    Arrays.sort(chars1);
                    String sorted1 = new String(chars1);
                    if(sorted.equals(sorted1)){
                        cand.get(key).add(k);
                        done = true;
                        break;
                    }
                }
            }
            if(!done){
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
