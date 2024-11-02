class Solution {
    public boolean isCircularSentence(String sentence) {
        String word[]=sentence.split(" ");
         if (word.length == 1) {
            return word[0].charAt(0) == word[0].charAt(word[0].length() - 1);
        }
        for(int i=0;i<word.length-1;i++){
            if(word[i].charAt(word[i].length()-1)!=word[i+1].charAt(0)){
                return false;
            }
        }
        return word[word.length - 1].charAt(word[word.length - 1].length() - 1) == word[0].charAt(0);
    }
}