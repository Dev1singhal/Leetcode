class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       for(int num:nums){
        if(num<k){
            pq.offer(num);
        }
       }
       int count=0;
       while(!pq.isEmpty()){
        int x=pq.poll();
        count++;
        if(pq.isEmpty()){
            break;
        }
        int y=pq.poll();
        long p=2L*x+y;
        if(p<k){
            pq.offer((int)p);
        }
       }
       return count;
    }
}