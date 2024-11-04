class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        backtreak(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    static void backtreak(List<List<Integer>>list,List<Integer>res,int arr[],int i){
        if(i==arr.length){
            list.add(new ArrayList(res));
            return;
        }
        backtreak(list,res,arr,i+1);
        res.add(arr[i]);
        backtreak(list,res,arr,i+1);
        res.remove(res.size()-1);
    }
}