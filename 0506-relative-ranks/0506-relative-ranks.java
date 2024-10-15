class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int n=score.length;
        for(int i=0;i<n;i++){
            mp.put(score[i],i);
        }
        Arrays.sort(score);

        String[]arr=new String[n];
        for(int i=n-1;i>=0;i--){
        int real=mp.get(score[i]);
        if(i==n-1){
            arr[real]="Gold Medal";
        }
        else if(i==n-2){
            arr[real]="Silver Medal";
        }
        else if(i==n-3){
            arr[real]="Bronze Medal";
        }
        else{
            arr[real]=String.valueOf(n-i);
        }
        }
        return arr;
    }
}