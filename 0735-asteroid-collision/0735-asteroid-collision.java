class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){

            if(st.size() == 0){
                st.push(asteroids[i]);
            }

            // ++ no collision possible  (st.peek() > 0 && asteroids[i] > 0 )
            // if asteroid[i] is positive they will never collide

            // -+ no collision possible  (st.peek() < 0 && asteroids[i] > 0  )
            // if asteroid[i] is positive they will never collide
           
            else if(asteroids[i] > 0 ){
                st.push(asteroids[i]);
            }

            else{ // if asteroid[i] is -ve

                // -- no collision possible both in same direction
                if(st.peek() < 0 ){ // ifpeek is also - 
                    st.push(asteroids[i]);
                }
            
                // -+ collision possible
                else{ 
                    if(st.peek() > Math.abs(asteroids[i])){
                        continue;
                    }else if(st.peek() < Math.abs(asteroids[i])){
                        st.pop();
                        i--;
                    }else if(st.peek() == Math.abs(asteroids[i])){
                        st.pop();
                        continue;
                    }
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