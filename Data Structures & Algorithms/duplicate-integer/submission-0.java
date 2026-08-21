class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> present = new HashMap();
        for(int i = 0;i < nums.length;i++){
            if(present.get(nums[i]) != null){
                return true;
            }
            present.put(nums[i], i);
        }
        return false;
    }
}