class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
         ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length;
        int n = arr[0].length;

        int firstRow = 0;
        int lastRow = m - 1;
        int firstColumn = 0;
        int lastColumn = n - 1;

        while (firstRow <= lastRow && firstColumn <= lastColumn) {

            // Left -> Right
            for (int j = firstColumn; j <= lastColumn; j++) {
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            // Top -> Bottom
            for (int i = firstRow; i <= lastRow; i++) {
                ans.add(arr[i][lastColumn]);
            }
            lastColumn--;

            // Right -> Left
            if (firstRow <= lastRow) {
                for (int j = lastColumn; j >= firstColumn; j--) {
                    ans.add(arr[lastRow][j]);
                }
                lastRow--;
            }

            // Bottom -> Top
            if (firstColumn <= lastColumn) {
                for (int i = lastRow; i >= firstRow; i--) {
                    ans.add(arr[i][firstColumn]);
                }
                firstColumn++;
            }
        }

        return ans;
        
    }
}