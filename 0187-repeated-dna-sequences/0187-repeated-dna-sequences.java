class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> result = new ArrayList<>();
        if (s.length() < 10) {
            return result;
        }
        HashMap<String,Integer> mp = new HashMap<>();
        // Set<String> repeated = new HashMap<>();
       for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            mp.put(substring,mp.getOrDefault(substring,0)+1);
        }
        List<String>list=new ArrayList<>();
        for(String key:mp.keySet()){
           if(mp.get(key)>1){
            list.add(key);
           }
        }
        return list;
    }
}