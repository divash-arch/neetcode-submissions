class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Map<Integer, Integer> pos = new HashMap();
        for(int j = 0; j < nums.length;j++){
            pos.put(nums[j], j);
        }

        Set<Integer> indexes = new HashSet();
        int ans = 1;
        for(int i = 0; i < nums.length;i++){
            if(indexes.contains(i)){
                continue;
            }
            int k = i;
            int freq = 0;
            while(k < nums.length 
               && pos.get(nums[k]+1) != null){
                
                indexes.add(pos.get(nums[k]));
                k = pos.get(nums[k] + 1);
                freq++;
            }
            ans = Math.max(ans, freq + 1);
        }

            return ans;

    }

}
