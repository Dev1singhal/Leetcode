class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = nums.size();
        for (int size = l; size <= r; size++) {
            int sum = 0;
            for (int i = 0; i < size; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                min = Math.min(min, sum);
            }
            for (int start = 1; start + size <= n; start++) {
                sum = sum - nums.get(start - 1) + nums.get(start + size - 1);
                if (sum > 0) {
                    min = Math.min(min, sum);
                }
            }
        }

        return min < Integer.MAX_VALUE ? min : -1;
    }
}
