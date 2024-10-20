class Solution {
    public List<String> stringSequence(String target) {
        List<String>list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:target.toCharArray()){
            sb.append('a');
            list.add(sb.toString());
            while(sb.charAt(sb.length()-1)!=ch){
                char last=sb.charAt(sb.length()-1);
                last = (last=='z')?'a':(char)(last+1);
                sb.setCharAt(sb.length()-1,last);
                list.add(sb.toString());
            }
        }
        return list;
    }
}