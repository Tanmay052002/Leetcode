class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char[] s , int sp , int ep){
        
        while(sp<ep){           // run upto s.length/2
            // Swapping
            char temp = s[sp];
            s[sp] = s[ep];
            s[ep] = temp;

            sp++;
            ep--;
        }
    }
}