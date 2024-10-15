class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            maxHeap.offer(num);
        }

        long sum = 0;

        while (k > 0) {
            int largest = maxHeap.poll();
            sum += largest;

            int reducedValue = (int) Math.ceil(largest / 3.0);
            maxHeap.offer(reducedValue);

            k--;
        }

        return sum;
    }
}
