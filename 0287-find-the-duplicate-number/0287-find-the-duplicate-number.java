class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correctIdx=arr[i]-1;
            if(arr[i] != arr[correctIdx]){
                int temp=arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
            }
            else i++ ;
        }
        for(i = 0 ; i < n ; i++){
            if(arr[i] !=i+1){
                return arr[i];
            }
        }
        return -1;

    }
}