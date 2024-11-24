class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int cur=10;
        int cnt=0;
         while(n>=cur){
            n-=cur;
            cur-=1;
            cnt++;
         }
         if(cnt%2==0){
            return false;
         }
         return true;
    }
}