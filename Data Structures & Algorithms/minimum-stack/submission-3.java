class MinStack {

   ArrayList<Integer> stack;
    Deque<Integer> minimums; 
    int min = Integer.MAX_VALUE;

    public MinStack() {

        stack = new ArrayList<>();
        minimums = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if(val <= min){
            min = val;
            minimums.push(stack.size() - 1);
        }
        
    }
    
    public void pop() {

        int n = stack.size();
        stack.remove(n -1);
        if(minimums.peek() == n -1){
           minimums.pop();
           if(!minimums.isEmpty()){
                min = stack.get(minimums.peek());
            }else{
                min = Integer.MAX_VALUE;
            }
        }
        
    }
    
    public int top() {

        int n = stack.size();
        return stack.get(n-1);
        
    }
    
    public int getMin() {
        return stack.get(minimums.peek());        

    }
}
