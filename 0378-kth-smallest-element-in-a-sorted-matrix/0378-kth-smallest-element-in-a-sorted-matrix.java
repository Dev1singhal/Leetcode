class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                pq.offer(matrix[i][j]);
            }
        }
        if(k==1){
            return pq.poll();
        }
        while(k-1>0){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}