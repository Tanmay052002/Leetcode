class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s , int sp , int ep){
        while(sp<ep){
            char temp = s[sp];
            s[sp] = s[ep];
            s[ep] = temp;

            sp++;
            ep--;
        }
    }
}