class Solution {
    public int partitionString(String s) {
        int count=1;
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                set.clear();
                count++;
            }
                set.add(ch);
        }
        return  count;
    }
}