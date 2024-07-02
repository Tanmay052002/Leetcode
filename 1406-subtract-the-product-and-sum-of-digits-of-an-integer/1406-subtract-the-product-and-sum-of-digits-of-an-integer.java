class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1;
        int i = 1;
        while(n>0){
            int lastDigit = n%10;
            sum = lastDigit + sum;
            mul = lastDigit * mul;
            n = n/10;
        }

        int diff = mul-sum;


        return diff; 
    }
}