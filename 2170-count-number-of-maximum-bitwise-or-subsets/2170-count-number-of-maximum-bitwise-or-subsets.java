class Solution {
     int count=0;
     int max=0;
    public int countMaxOrSubsets(int[] nums) {
        for(int num:nums){
            max=max|num;
        }
        check(nums,nums.length,0,0);
        return count;
    }
     void check(int nums[],int n,int i,int t){
        if(i==n){
            if(t==max){
                count++;
            }
            return;
        }
        check(nums,n,i+1,t|nums[i]);
        check(nums,n,i+1,t);

    }
}