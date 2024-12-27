class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int max=0;
        for(int i=0;i<n;i++){
            int p=1;
            for(int j=i;j<n;j++){
                p*=nums[j];
                max=Math.max(max,p);
            }
        }
        return max;
    }
}
