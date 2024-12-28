class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            char word=ch[i];
            if(st.isEmpty()){
                if(word==')' || word==']' || word=='}'){
                    return false;
                }
                else{
                    st.push(word);
                }
            }
            else{
                char peek=st.peek();
                if(word=='(' || word=='[' || word=='{'){
                    st.push(word);
                }
         else if((word==')' && peek=='(')||(word==']' && peek=='[')||(word=='}' && peek=='{')){
            st.pop();
            continue;
         }
         else{
            return false;
         }
            }
        }
        return st.size()==0;
    }
}