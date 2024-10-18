class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        int count=0;
        boolean odd=false;
        for(int key:mp.values()){
            if(key%2==0){
                count+=key;
            }
            else{
                count+=key-1;
                odd=true;
            }
        }
        if(odd){
            count+=1;
        }
        return count;
    }
}