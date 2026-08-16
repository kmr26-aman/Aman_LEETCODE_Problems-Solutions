class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
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
                ans.add(i+1);
            }
        }
        return ans;
    }
}