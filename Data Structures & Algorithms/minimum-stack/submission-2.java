class MinStack {

    ArrayList<Integer> stack;
    ArrayList<Integer> minimums;
    int min = Integer.MAX_VALUE;

    public MinStack() {

        stack = new ArrayList();
        minimums = new ArrayList();
    }
    
    public void push(int val) {
        stack.add(val);
        if(val <= min){
            min = val;
            minimums.add(stack.size() - 1);
        }
    }
    
    public void pop() {
        int n = stack.size();
        stack.remove(n -1);
        if(minimums.get(minimums.size()-1) == n -1){
            minimums.remove(minimums.size() - 1);
            if(minimums.size() <= 0){
                min = Integer.MAX_VALUE;
            }else{
                min = stack.get(minimums.get(minimums.size() - 1));
            }
        }
    }
    
    public int top() {
        int n = stack.size();
        return stack.get(n-1);
    }
    
    public int getMin() {
        return stack.get(minimums.get(minimums.size() - 1));        
    }
}
