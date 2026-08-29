class Solution {
    public int evalRPN(String[] tokens) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens){
            int ans = 0;
            int a;
            int b;
            switch(token){
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    ans = a+b;
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    ans = b - a;
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    ans = a*b;
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    ans = b/a;
                    break;
                default:
                    ans =  Integer.parseInt(token);
            }
            stack.push(ans);
        }

        return stack.pop();
        
    }
}
