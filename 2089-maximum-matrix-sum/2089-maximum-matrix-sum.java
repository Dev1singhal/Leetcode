class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        long sum=0;
        int count=0;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    count++;
                }
                small=Math.min(small,Math.abs(matrix[i][j]));
            }
        }
        if(count%2==0){
            return sum;
        }
        else{
            return sum-2L *small;
        }
    }
}