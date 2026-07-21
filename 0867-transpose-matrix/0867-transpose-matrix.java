class Solution {
    public int[][] transpose(int[][] arr1) {
        int n = arr1.length;
        int m = arr1[0].length ;
        int[][] arr2 =new int[m][n];
         for(int i = 0 ; i <arr2.length ; i++){
            for(int j = 0 ; j<arr2[0].length ;j++){
                arr2[i][j]=arr1[j][i];
            }
        }
        return arr2;
    }
}