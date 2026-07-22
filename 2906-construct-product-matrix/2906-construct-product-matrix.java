class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
         int MOD = 12345;

        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;

        long[] prefix = new long[size];
        long[] suffix = new long[size];

        // Prefix products
        prefix[0] = 1;
        for (int i = 1; i < size; i++) {
            int row = (i - 1) / m;
            int col = (i - 1) % m;
            prefix[i] = (prefix[i - 1] * grid[row][col]) % MOD;
        }

        // Suffix products
        suffix[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            int row = (i + 1) / m;
            int col = (i + 1) % m;
            suffix[i] = (suffix[i + 1] * grid[row][col]) % MOD;
        }

        int[][] ans = new int[n][m];

        for (int i = 0; i < size; i++) {
            int row = i / m;
            int col = i % m;

            ans[row][col] = (int) ((prefix[i] * suffix[i]) % MOD);
        }

        return ans;
    }
}