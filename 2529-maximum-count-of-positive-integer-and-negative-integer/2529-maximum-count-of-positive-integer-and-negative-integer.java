class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length ;
        // int left = 0 ;
        // int right = n-1 ; 
        int countPositive = 0 ;
         int countNegative = 0 ;
        for (int i = 0 ; i < n ; i ++){
            if (arr[i]==0) continue ;
            else if(arr[i]> 0){
                countPositive++ ;
            } else {
                countNegative++ ;
            }
        }
        return Math.max(countPositive, countNegative);

        
    }
}