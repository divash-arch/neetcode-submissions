class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums[0];
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[end] > nums[mid]){
                ans = Math.min(nums[mid], ans);
                end = mid - 1;
            }else if (nums[start] <= nums[mid]){
                ans = Math.min(nums[start], ans);
                start = mid + 1;
            }
        }

        return ans;
        
    }
}
