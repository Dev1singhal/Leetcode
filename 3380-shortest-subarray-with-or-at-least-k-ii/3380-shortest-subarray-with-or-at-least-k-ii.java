class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int i=0,j=0,ans=Integer.MAX_VALUE,n=nums.length;
        int[] bit=new int[32];
        while(j<n){
            addContoJ(nums[j],bit,true);
            while(isConMore(k,bit)&&i<=j){
                ans=Math.min(ans,j-i+1);
                addContoJ(nums[i],bit,false);
                i++;
            }
            j++;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    void addContoJ(int val,int[] bit,boolean add){
        int i=0;
        while(val>0){
            bit[i]=bit[i]+(add?1:-1)*val%2;
            val/=2;
            i++;
        }
    }

    boolean isConMore(int k,int[] bit){
        int bitval=0;
        for(int i=0;i<32;i++){
            bitval+=(bit[i]!=0?1:0)*(int)(Math.pow(2,i));
        }
        return (bitval>=k);
    }
}