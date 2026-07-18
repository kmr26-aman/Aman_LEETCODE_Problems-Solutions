class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        boolean foundBreak = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                if (foundBreak) {
                    return false;
                }
                foundBreak = true;
            }
        }

        return true;
    }
}