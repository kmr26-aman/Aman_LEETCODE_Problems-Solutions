class Solution {
    public int maxFrequencyElements(int[] nums) {
         Arrays.sort(nums);

        int n = nums.length;
        int maxFreq = 0;
        int ans = 0;

        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            int freq = j - i;

            if (freq > maxFreq) {
                maxFreq = freq;
                ans = freq;
            } else if (freq == maxFreq) {
                ans += freq;
            }

            i = j;
        }

        return ans;
    }
}