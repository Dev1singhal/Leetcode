class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1){
            return true;
        }
       int cover=0;
       int last =0;
       int max=0;
       for(int i=0;i<n;i++){
        if(i>cover){
            return false;
        }
        cover=Math.max(cover,i+nums[i]);
        if(cover>=n-1){
            return true;
        }
       }
       return false;
    }
}