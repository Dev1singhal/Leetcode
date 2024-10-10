class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr, -1);
        if (n < 2 * k + 1) {
            return arr;
        }
        if (k == 0) {
            return nums;
        }
        int size = 2 * k + 1;
        long sum = 0;
        for (int j = 0; j < size; j++) {
            sum += nums[j];
        }
        arr[k] = (int) (sum / size);
        for (int i = k + 1; i < n - k; i++) {
            sum = sum - nums[i - k - 1] + nums[i + k];
            arr[i] = (int) (sum / size);
        }
        
        return arr;
    }
}
