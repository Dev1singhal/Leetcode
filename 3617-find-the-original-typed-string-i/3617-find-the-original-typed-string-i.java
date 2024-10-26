class Solution {
    public int possibleStringCount(String word) {
        int count=1;
        int i=0;
        while(i<word.length()){
            int j=i;
            while(j<word.length() && word.charAt(j)==word.charAt(i)){
                j++;
            }
            int len=j-i;
            count+=len-1;
            i=j;
        }
        return count;
    }
}