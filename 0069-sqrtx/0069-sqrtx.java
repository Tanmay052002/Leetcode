class Solution {
    public int mySqrt(int x) {
        long ans = 0;
        long  i = 0;

        while(i*i <= x){
            ans = i;
            i++;
        }
        
        return (int)ans;
    }
}