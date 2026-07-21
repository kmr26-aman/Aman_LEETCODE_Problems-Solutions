class Solution {
    public void rotate(int[][] arr) {
        int n = arr.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
           int left = 0;
           int right = arr[i].length - 1;

           while (left < right) {
          int temp = arr[i][left];
          arr[i][left] = arr[i][right];
          arr[i][right] = temp;

          left++;
          right--;
    }
}
    }
}