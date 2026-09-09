class Solution {
    public int pivotIndex(int[] nums) {

        int total = 0;

        // Find total sum
        for (int num : nums) {
            total += num;
        }

        int left = 0;

        // Find pivot
        for (int i = 0; i < nums.length; i++) {

            int right = total - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
}