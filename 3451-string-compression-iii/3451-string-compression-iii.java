class Solution {
    public String compressedString(String word) {
        StringBuilder sb=new StringBuilder();
        int l=1;
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1)){
                l++;
                if(l>9){
                    sb.append(l-1);
                    sb.append(word.charAt(i));
                    l=1;
                }}
                else{
                    sb.append(l);
                    sb.append(word.charAt(i));
                    l=1;
                }
            
        }
        sb.append(l);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}