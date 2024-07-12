class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){
            if(st.size() == 0){
                st.push(asteroids[i]);
            }else if(asteroids[i] < 0 && st.peek() < 0){
                st.push(asteroids[i]);
            }else if(asteroids[i] > 0 && st.peek() > 0){
                st.push(asteroids[i]);
            }else if(asteroids[i] > 0 && st.peek() < 0){
                st.push(asteroids[i]);
            }else if(asteroids[i] < 0 && st.peek() > 0){
                if(st.peek() > -1*(asteroids[i])){
                    continue;
                }else if(st.peek() < -1*(asteroids[i])){
                    st.pop();
                    i--;
                }else if(st.peek() == -1*(asteroids[i])){
                    st.pop();
                    continue;
                }
            }
        }
        int[] arr = new int[st.size()];
        for(int i = arr.length-1; i >= 0;i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}