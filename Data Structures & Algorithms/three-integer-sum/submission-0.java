class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
              List<List<Integer>> ans = new ArrayList();
            Arrays.sort(nums);
            int i = 0;
            while(i <= nums.length - 1){
                int k = nums[i]*-1;
                int si = i+1;
                int t = nums.length - 1;
                while(si < t){
                    if(nums[si] + nums[t] == k){
                        ans.add(new ArrayList<>(List.of(nums[si], nums[t], k*-1)));
                        si++;
                        while(si < t && nums[si] == nums[si-1]){
                            si++;
                        }
                        t--;
                        while(si < t && nums[t] == nums[t+1]){
                            t--;
                        }   
                    }else if(nums[si] + nums[t] < k){
                        si++;
                    }else{
                        t--;
                    }
                }
                i++;
                while(i < nums.length && nums[i] == nums[i-1]){
                    i++;
                }
            }

            return ans;
        }
    }

