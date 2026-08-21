class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int arr[] = new int[1001];
        HashSet<Integer> ans = new HashSet<Integer>();
        int i = 0;
        while(i < nums1.length){
            arr[nums1[i]]++;
            i++;
        }
        i = 0;
        while(i < nums2.length){
            if(arr[nums2[i]]>0){
                ans.add(nums2[i]);
            }
            i++;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}