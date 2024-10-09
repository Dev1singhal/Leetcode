class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int st=0;
        int e=0;
        int n=s.length();
        int freq[]=new int[3];
        while(e<n){
           freq[s.charAt(e)-'a']++;
           while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            count+=n-e;
            freq[s.charAt(st)-'a']--;
           st++;
           }
           
           e++;
        }
        return count;
    }
}