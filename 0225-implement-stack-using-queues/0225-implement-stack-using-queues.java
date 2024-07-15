class MyStack {

    Queue<Integer> q1 = new LinkedList<>();

    public MyStack() {   

    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        int n = q1.size();
        for(int i = 1; i < n ;i++){
            q1.add(q1.remove());
        }
        int temp = q1.remove();
        return temp;
    }
    
    public int top() {
        int n = q1.size();
        for(int i = 1; i < n ;i++){
            q1.add(q1.remove());
        }
        
        int temp = q1.remove();
        q1.add(temp);
        return temp;
    }
    
    public boolean empty() {
        if(q1.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */