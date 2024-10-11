class Solution {
    public int maxConsecutiveAnswers(String ans, int k) {
        return Math.max(check(ans,k,'T'),check(ans,k,'F'));
    }
    static int check(String ans,int k,char ch){
        int left=0;
        int count=0;
        int max=0;
        for(int right=0;right<ans.length();right++){
            if(ans.charAt(right)!=ch){
                count++;
            }
            while(count>k){
                   if(ans.charAt(left)!=ch){
                    count--;
                   }
                    left++;
                }
                max=Math.max(max,right-left+1);
            }
            return max;
        }
    
}