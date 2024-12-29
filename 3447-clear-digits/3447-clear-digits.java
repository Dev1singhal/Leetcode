class Solution {
    public String clearDigits(String s) {
        char ch[]=s.toCharArray();
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:ch){
            if(!st.isEmpty() && Character.isDigit(c)){
                 st.pop();
            }
            if(!Character.isDigit(c)){
                st.push(c);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}