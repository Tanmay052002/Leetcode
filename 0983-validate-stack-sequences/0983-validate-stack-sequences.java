class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        
        int j = 0;
        for(int i = 0; i < pushed.length; i++){
            if(st.size() != 0 && st.peek() == popped[j]){
                System.out.println(st.peek());
                st.pop();
                j++;
                i--;
            }else{
                st.push(pushed[i]);
                System.out.println("-----"+st.peek());

            }

        }
        
        for(int i = j; i < popped.length; i++){
            if(st.size() != 0 && st.peek() == popped[i]){
                st.pop();
            }
        }

        if(st.size() == 0){
            return true;
        }else{
            return false;
        }
            
    }
}