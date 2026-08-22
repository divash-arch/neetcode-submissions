class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

         Deque<Integer> stack = new ArrayDeque<>();
        int [] ans = new int[temperatures.length];
        int n = temperatures.length;
        for(int i = n - 1;i >=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]){
                int currentDay = stack.pop();
                if(stack.isEmpty()){
                    ans[currentDay] = 0;
                    break;
                }
                ans[currentDay] = stack.peek() - currentDay;
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek() - i;
            }else{
                ans[i] = 0;
            }
            stack.push(i);

        }

        return ans;
        
    }
}
