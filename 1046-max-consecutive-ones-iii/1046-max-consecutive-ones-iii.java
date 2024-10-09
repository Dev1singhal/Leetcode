class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0;
        int e=0;
        int zero=0;
        int max=0;
        while(e<nums.length){
            if(nums[e]==0){
                zero++;
            }
            while(zero>k){
                if(nums[s]==0){
                    zero--;
                }
                s++;
            }
            max=Math.max(max,e-s+1);
            e++;
        }
        return max;
    }
}