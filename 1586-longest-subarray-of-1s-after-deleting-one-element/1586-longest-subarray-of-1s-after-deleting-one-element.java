public class Solution {
    public int longestSubarray(int[] nums) {
       int left=0;
       int right=0;
       int max=0;
       boolean check=false;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            right++;
        }
        else{
            check=true;
            max=Math.max(max,left+right);
            left=right;
            right=0;
        }
       }
       max=Math.max(max,left+right);
       return check?max:nums.length-1;
    }
}
