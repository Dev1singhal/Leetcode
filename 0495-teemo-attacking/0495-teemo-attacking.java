class Solution {
    public int findPoisonedDuration(int[] time, int d) {
        int count=0;
        if(time.length==0){
            return 0;
        }
        for(int i=0;i<time.length-1;i++){
            count+=Math.min(d,time[i+1]-time[i]);
        }
        count+=d;
        return count;
    }
}