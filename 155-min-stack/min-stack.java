class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> dummyStack;

    public MinStack() {
        mainStack = new Stack<>();
        dummyStack = new Stack<>();
        
    }
    
    public void push(int val) {
        if(dummyStack.isEmpty() || val <= dummyStack.peek()){
            dummyStack.push(val);
        }
        mainStack.push(val);
        
    }
    
    public void pop() {
        if(mainStack.isEmpty()){
            return;
        }

        if(!dummyStack.isEmpty()){
            if(dummyStack.peek().equals(mainStack.peek())){
                dummyStack.pop();
            }
        }
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return dummyStack.isEmpty() ? - 1 : dummyStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */