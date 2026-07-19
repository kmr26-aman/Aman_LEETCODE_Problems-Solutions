class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length ; 
        int left = 0 ; 
        int right = n-1 ;
        while(left <= right){
            int mid = left + (right - left )/2 ;
            int correctNumber = mid + 1 ;
            int missing = arr[mid]-correctNumber;
            if(missing >= k) right = mid -1;
            else left = mid + 1;
        }
        return right + 1 + k ;
    }
}