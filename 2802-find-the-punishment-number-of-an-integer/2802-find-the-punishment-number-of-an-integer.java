class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            int sqr=i*i;
            if(check(String.valueOf(sqr),i,0,0)){
                sum+=sqr;
            }
        }
        return sum;
    }
    static boolean check(String num,int target,int i,int sum){
        if(i==num.length()){
            return sum==target;
        }
        int n=0;
        for(int j=i;j<num.length();j++){
            n=n*10+(num.charAt(j)-'0');
            if(check(num,target,j+1,sum+n)){
                return true;
            }
        }
        return false;
    }
}