class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->mp.get(a)-mp.get(b));
        for(int key:mp.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int arr[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            arr[i]=pq.poll();
            i++;
        }
       return arr;
    }
}