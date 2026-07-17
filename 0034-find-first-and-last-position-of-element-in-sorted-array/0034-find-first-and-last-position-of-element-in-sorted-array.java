class Solution {
    public int[] searchRange(int[] arr, int target) {
    //     int n = arr.length ;
    //     int left = 0;
    //     int right = n-1 ;
    //     int index = -1 ;
        int[] ans = new int[2] ;
        ans[0] =firstOccurence(arr , target);
        ans[1] =lastOccurence(arr , target);
        return ans ;
    }


    public int firstOccurence(int[] arr ,int target){
        int n = arr.length ;
        int left = 0;
        int right = n-1 ;
        int index = -1 ;
        while(left <= right ){
            int mid = (left + right) /2 ;
            if (arr[mid] == target){
                index = mid ;
                right= mid - 1 ;
                
            }
            else if (arr[mid] < target ){
                left = mid +1 ;
            }
            else {
                right = mid -1 ;
            }
        }
        return index ;
    }

     public int lastOccurence(int[] arr ,int target){
        int n = arr.length ;
        int left = 0;
        int right = n-1 ;
        int index = -1 ;
        while(left <= right ){
            int mid = (left + right) /2 ;
            if (arr[mid] == target){
                index = mid ;
                left= mid + 1 ;
                
            }
            else if (arr[mid] < target ){
                left = mid +1 ;
            }
            else {
                right = mid - 1 ;
            }
        }
        return index ;
    }
}