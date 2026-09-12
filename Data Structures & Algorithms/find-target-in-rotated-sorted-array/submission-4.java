class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        if(target == nums[end]){
            return end;
        }
        if(target == nums[start]){
            return start;
        }
        int ansIn = 0;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[end] > nums[mid]){
                if(nums[mid] < nums[ansIn]){
                    ansIn = mid;
                }
                end = mid - 1;
            }else if (nums[start] <= nums[mid]){
                if(nums[start] < nums[ansIn]){
                    ansIn = start;
                }
                start = mid + 1;
            }
        }

        if(target == nums[ansIn]){
            return ansIn;
        }

        end = nums.length - 1;

        if(ansIn < end && target < nums[end]){
            start = ansIn+1;
        }else{
            end = ansIn - 1;;
            start = 0;
        }

         while(start <= end){
            int mid = (start + end)/2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }


        return -1;

        
    }
}
