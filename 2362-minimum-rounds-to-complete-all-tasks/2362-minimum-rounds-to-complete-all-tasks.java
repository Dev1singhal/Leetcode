class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int task:tasks){
            mp.put(task,mp.getOrDefault(task,0)+1);
        }
        int count=0;
        for(int key:mp.values()){
            int frq=key;
            if(frq<2){
                return -1;
            }
            else if(frq==2 || frq==3){
                    count++;
                }
            else{
                   count+=frq/3;
                   if(frq%3 !=0){
                    count++;
                   }
                }
            }
        return count;
    }
}