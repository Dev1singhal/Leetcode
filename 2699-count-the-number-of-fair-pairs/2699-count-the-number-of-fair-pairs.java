class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums,upper)-count(nums,lower-1);
    }
    long count(int nums[],int k){
        int i=0;
        int j=nums.length-1;
        long total=0;
        while(i<j){
            if(nums[i]+nums[j]<=k){
                total+=(j-i);
                i++;
            }
            else{
                j--;
            }
        }
        return total;
    }
}