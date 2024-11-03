class Solution {
    public boolean isBalanced(String num) {
        String val[]=num.split("");
        int c1=0;
       int c2=0;
       for(int i=0;i<val.length;i++){
        if(i%2==0){
            c1+=Integer.parseInt(val[i]);
        }
        else{
            c2+=Integer.parseInt(val[i]);
        }
       }
       return c1==c2;
    }
}