class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int add) {
        int count=0;
        int   left=0;
        int arr[]=new int[rocks.length];
        for(int i=0;i<rocks.length;i++){
            arr[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            else{
                if(add!=0){
                    add=add-arr[i];
                    if(add<0){
                        return count;
                    }
                    else{
                        count++;
                    }
                }
            }
        }
        return count;
    }
}