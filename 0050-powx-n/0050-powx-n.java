class Solution {
    public double myPow(double x, int n) {
        long p = n; // as power can be more then 10^9
        if(n<0){
        double res = pow(x,-p);
        return 1/res;
        }else if(n==0){
            return 1;
        }else{
        double res = pow(x,p);
        return res;
        }
    }
    public static double pow(double a, long n){
        if(n==0 || n == 1){
            return a;
        }

        double temp = pow(a,n/2);
        
        if(n%2 == 0){
        return temp*temp;
        } else{
            return temp*temp*a;
        }
    }
}