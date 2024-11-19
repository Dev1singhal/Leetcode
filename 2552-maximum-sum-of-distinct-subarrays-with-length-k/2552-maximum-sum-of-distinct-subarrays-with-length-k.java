class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> elements = new HashSet<>();
        long sum = 0;
        long max = 0;
        int left = 0;
        
        for (int right= 0; right < n; right++) {
            if (!elements.contains(nums[right])) {
                sum += nums[right];
                elements.add(nums[right]);
                
                if (right - left + 1 == k) {
                    max = Math.max(max,sum);
                    sum -= nums[left];
                    elements.remove(nums[left]);
                    left++;
                }
            } else {
                while (nums[left] != nums[right]) {
                    sum -= nums[left];
                    elements.remove(nums[left]);
                    left++;
                }
                left++;
            }
        }
        
        return max;
    }
}