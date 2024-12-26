class Solution {
    public void rotate(int[][] arr) {
        //transpose
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        //reverse
        for(int i=0;i<arr.length;i++){
            int s=0;
            int e=arr[0].length-1;
            while(s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
        }
    }
}