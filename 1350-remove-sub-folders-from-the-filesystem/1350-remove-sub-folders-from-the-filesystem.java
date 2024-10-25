class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder); 
        List<String> list = new ArrayList<>();
        String p = " ";
        for (String ch : folder) {
            if (!ch.startsWith(p + "/")) {
                list.add(ch);
                p = ch;  
            }
        }
        
        return list;
    }
}
