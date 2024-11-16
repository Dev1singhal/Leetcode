class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length-k+1;
        int arr[]=new int[n];
         if(nums.length<k){
            return new int[]{-1};
         }
         int i=0;
         int j=k-1;
         int t=0;
         while(j<nums.length){
            if(check(nums,i,j)){
                arr[t]=nums[j];
            }
            else{
                arr[t]=-1;
            }
            i++;
            j++;
            t++;
         }
         return arr;
    }
    static boolean check(int nums[],int i,int j){
        for(int s=i;s<j;s++){
            if(nums[s]+1 != nums[s+1]){
                return false;
            }
        }
        return true;
    }
}