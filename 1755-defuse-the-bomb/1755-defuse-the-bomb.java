class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];
        if (k == 0) {
            Arrays.fill(arr, 0);
            return arr;
        }
        int[] num = new int[2 * n];
        for (int i = 0; i < n; i++) {
            num[i] = code[i];
            num[i+n] = code[i];
        } 
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j=1;j<= k;j++) {
                    sum+=num[i+j];
                }
                arr[i] = sum;
            }
        } 
        else { 
            for (int i= 0;i< n; i++) {
                int sum=0;
                for (int j = 1; j <= -k; j++) {
                    sum+= num[i+n-j];
                }
                arr[i] = sum;
            }
        }
        return arr;
    }
}
