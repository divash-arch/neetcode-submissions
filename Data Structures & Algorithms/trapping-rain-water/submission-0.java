class Solution {
    public int trap(int[] height) {
       int i = 0; 
       for(i = 0;i < height.length;i++){
            if(height[i] > 0){
                break;
            }
        }
        
        Deque<Integer> stack = new ArrayDeque();
        int ans = 0;
        while(i < height.length){
            while(!stack.isEmpty() && stack.size() >= 2 &&
                      height[stack.peek()] < height[i]){
                int first = height[stack.pop()];
                int second = height[stack.peek()];
                int minHeight = Math.min(height[i], second) - first;
                ans += minHeight * ((i - stack.peek()) - 1);
            }
            while(!stack.isEmpty() && height[stack.peekLast()] < height[i]){
                stack.pop();
            }
            stack.push(i);
            i++;

        }

        return ans;
    }
}
