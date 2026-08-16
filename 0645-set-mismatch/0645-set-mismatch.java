class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int i = 0;
        while(i<n){
            int correctIdx=arr[i]-1;
            if(arr[i]==i+1 || arr[correctIdx] ==arr[i]) {
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
            ans[0] = arr[i];
            ans[1] = i + 1;
            }
        }
        return ans;
    }
}