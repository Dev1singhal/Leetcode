class Solution {
    public int longestSquareStreak(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }
       int max=0;
       for(int num:nums){
           int l=0;
           int curr=num;
           while(set.contains(curr)){
            l++;
             if (curr > Math.sqrt(Integer.MAX_VALUE)) {
                    break;
                }
            curr*=curr;
            if(!set.contains(curr)){
                break;
            }
           }
           max=Math.max(max,l);
       }
       return max>1?max:-1;
    }
}