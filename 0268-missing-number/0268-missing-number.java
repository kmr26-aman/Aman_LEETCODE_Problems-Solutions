class Solution {
    public int missingNumber(int[] arr) {
        long n = arr.length ;
        long sum = (n*(n+1))/2;
        long arraySum =0;
        for (int ele : arr){
            arraySum +=ele;
        }
        return (int)(sum - arraySum);
        
    }
}