class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int key:mp.values()){
           while(key>0 && set.contains(key)){
            key--;
            count++;
           }
           if(key>0){
            set.add(key);
           }
        }
        return count;
    }
}