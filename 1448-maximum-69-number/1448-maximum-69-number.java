class Solution {
    public int maximum69Number (int num) {
        String st=String.valueOf(num);
        StringBuilder sb=new StringBuilder();
        int k=1;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='6' && k==1){
                sb.append('9');
                k--;
            }
            else{
                sb.append(st.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}