class Solution {
    public int[] getMaximumXor(int[] nums, int bit) {
        int arr[]=new int[nums.length];
        int n=nums.length;
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int mask=((1<<bit)-1);
        for(int i=0;i<n;i++){
            arr[i]=xor^mask;
            xor^=nums[n-i-1];
        }
        return arr;
    }
}