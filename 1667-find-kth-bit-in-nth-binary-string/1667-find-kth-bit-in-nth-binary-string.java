class Solution {
    public char findKthBit(int n, int k) {
        if (n == 1) {
            return '0';
        }
        int len = (int)Math.pow(2, n) - 1; 
        if (k == len / 2 + 1) {
            return '1'; 
        }
        if (k < len / 2 + 1) {
            return findKthBit(n - 1, k); 
        } else {
            char ch = findKthBit(n - 1, len - k + 1); 
            return ch == '0' ? '1' : '0';
        }
    }
}
