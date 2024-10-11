class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int left=0;
        int mul=1;
        int n=nums.length;
        if(k<=1){
            return 0;
        }
        for(int right=0;right<n;right++){
            mul*=nums[right];
            while(mul>=k && left<=right){
                mul/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}