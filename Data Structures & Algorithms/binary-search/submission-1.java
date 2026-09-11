class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while(start < end - 1){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                return mid;
            }else if(nums[mid] < target){
                start = mid;
            }else{
                end = mid;
            }
        }

        if(nums[start] == target){
            return start;
        }

        if(nums[end] == target){
            return end;
        }
        return -1;
    }
}
