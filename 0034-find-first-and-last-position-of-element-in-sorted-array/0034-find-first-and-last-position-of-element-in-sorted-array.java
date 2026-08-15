class Solution {
    private int lowerbound(int nums[], int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int upperbound(int nums[], int target) {

        int low = 0;
        int high = nums.length - 1;
        int second = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = lowerbound(nums, target);

        // Target doesn't exist
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        int second = upperbound(nums, target);

        return new int[]{first, second - 1};
    }
}