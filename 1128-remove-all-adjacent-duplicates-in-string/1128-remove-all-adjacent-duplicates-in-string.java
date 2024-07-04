class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length();i++){
            if(st.size() == 0 || st.peek() != s.charAt(i) ){
                st.push(s.charAt(i));
            }else{
                st.pop();
            }
        }

        char[] ch = new char[st.size()];

        for(int i = ch.length-1; i >= 0;i--){
            ch[i] = st.pop();
        }
        return "".valueOf(ch);
    }
}