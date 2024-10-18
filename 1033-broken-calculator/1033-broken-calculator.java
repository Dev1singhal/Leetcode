class Solution {
    public int brokenCalc(int start, int target) {
        int count=0;
        while(target>start){
            if(target%2==0){
                target=target/2;
                count++;
            }
            else{
                target+=1;
                count++;
            }
        }
        return count+(start-target);
    }
}