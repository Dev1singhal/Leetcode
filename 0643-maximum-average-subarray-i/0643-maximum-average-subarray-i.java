class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("k cannot be greater than the length of the array");
        }
        double max = Double.NEGATIVE_INFINITY;
        int sum = 0;
        int s = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i-s+1==k){
                double avg= (double)sum/k;
                max=Math.max(max,avg);
                sum=sum-nums[s];
                s++;
            }
        }
        return max;
    }
}