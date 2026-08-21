class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap();
        for(int i = 0;i < nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> [] buckets = new ArrayList[nums.length +1];
        for(int i = 1; i <= nums.length;i++){
            buckets[i] = new ArrayList();
        }

        for(int num: freq.keySet()){
            int c = freq.get(num);
            buckets[c].add(num);
        }

        int [] ans = new int[k];
        for(int i = nums.length;i >= 1;i--){
            if(buckets[i].size() > 0){
                for(int j = 0; j < buckets[i].size();j++){
                    ans[--k] = buckets[i].get(j);
                    if(k == 0){
                        return ans;
                    }
                }
            }
        }

        return ans;
        
        
    }
}
