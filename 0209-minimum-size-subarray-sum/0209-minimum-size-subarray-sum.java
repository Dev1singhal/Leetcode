class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=n+1;
        int sum=0;
        int e=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
            min=Math.min(min,i-e+1);
            sum=sum-nums[e];
            e++;
            }
        }
        return min==n+1?0:min;
    }
}
