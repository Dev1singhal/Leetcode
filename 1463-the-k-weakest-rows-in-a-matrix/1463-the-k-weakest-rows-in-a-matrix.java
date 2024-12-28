class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] nums= new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int n=0;
            for(int j=0;j<mat[i].length;j++){
                n=(mat[i][j]==1)? n+1:n;
            }
            nums[i][0]=n;
            nums[i][1]=i;
        }
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=nums[i][1];
        }
        return result;
    }
}