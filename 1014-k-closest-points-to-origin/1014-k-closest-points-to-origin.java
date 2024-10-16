class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1])
        );
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > K) {
                pq.poll(); 
            }
        }
        int[][] arr = new int[K][2];
        for (int i = 0; i < K; i++) {
            arr[i] = pq.poll();
        }

        return arr;
    }
}
