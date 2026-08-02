import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), result);
        return result;
    }

    public void helper(int index, int[] nums, List<Integer> current,
                       List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include current element
        current.add(nums[index]);
        helper(index + 1, nums, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude current element
        helper(index + 1, nums, current, result);
    }
}