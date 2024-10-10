class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int n = nums.length;
        long count = 0;
        int start = 0; 
        int lastMinK = -1; 
        int lastMaxK = -1;
        int invalidIndex = -1; 
        for (int i = 0; i < n; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                invalidIndex = i;  
            }
            if (nums[i] == minK) {
                lastMinK = i; 
            }
            if (nums[i] == maxK) {
                lastMaxK = i; 
            }
            start = Math.max(start, invalidIndex + 1);
            count += Math.max(0, Math.min(lastMinK, lastMaxK) - start + 1);
        }
        return count;
    }
}