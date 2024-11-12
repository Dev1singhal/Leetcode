class Solution {
    public boolean primeSubOperation(int[] nums) {
        int prime[] =new int[170];
        int n=nums.length;
        Prime(prime);
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                continue;
            }else{
               for(int p:prime){
                if(p>=nums[i]){
                    break;
                }
                if(nums[i]-p<nums[i+1]){
                    nums[i]=nums[i]-p;
                    break;
                }
               }
            }
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }

    void Prime(int[] arr){
        int k=0;
        for(int i=2;i<=1000;i++){
            boolean flag=false;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                arr[k]=i;
                k++;
            }
        }
    }
}