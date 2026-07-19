class Solution {
    public int arrangeCoins(int n) {
        long m = (long)n ;
        return (sqrt(8 * m + 1) - 1) / 2 ;  //
        
    }

     public int sqrt(long n){
            if(n==0) return 0;
            long left = 1 ;
            long right = n;
            while(left <= right){
                long mid = left + ( right - left)/2 ;
                if(mid == n/mid) return (int)mid ; 
                else if(mid > n/mid){
                    right = mid - 1 ;
                }else {
                    left = mid +1 ;
                }
            }
            return (int)right;
        }

}