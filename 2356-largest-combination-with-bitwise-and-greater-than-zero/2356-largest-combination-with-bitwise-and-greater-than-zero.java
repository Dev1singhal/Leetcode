class Solution {
    public int largestCombination(int[] candidates) {
        int count[]=new int[36];
        int res=0;
        for(int i=0;i<36;i++){
        for(int num:candidates){
            if((num & (1<<i))!=0){
                count[i]++;
            }
        }
        res=Math.max(res,count[i]);
        }
        return  res;
    }
}