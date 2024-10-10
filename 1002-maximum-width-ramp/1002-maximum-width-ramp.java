class Solution {
    public int maxWidthRamp(int[] A) {
        int n = A.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || A[stack.peek()] > A[i]) {
                stack.push(i);
            }
        }
        int maxWidth = 0;
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }
        
        return maxWidth;
    }
}
