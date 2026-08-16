class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correctIdx=arr[i]-1;
            if(arr[i]<=0 || arr[i]> n  || arr[i]==i+1 || arr[correctIdx] ==arr[i]) {
                i++;
            }
            else{
                int temp = arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
            }
        }
        for(i=0 ; i< n  ; i ++){
            if(arr[i]!=i+1){
             return i+1 ;
            }
        }
        return n+ 1;

        
    }
}